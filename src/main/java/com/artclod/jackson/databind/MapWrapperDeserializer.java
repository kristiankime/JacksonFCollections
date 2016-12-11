package com.artclod.jackson.databind;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * This class handles of the needs of json deserialization for a class that is simply a wrapper around an existing Java Map that already has a deserializer.
 * For example {@link com.artclod.common.collect.HashFMap} is a wrapper around {@link java.util.HashMap} so this class can easily provide a deserializer for it.
 * 
 * @param <W> The wrapper map type
 * @param <M> The wrapped map type
 * @param <K> The key type
 * @param <V> The value type
 */
//http://stackoverflow.com/questions/36159677/how-to-create-a-custom-deserializer-in-jackson-for-a-generic-type
public abstract class MapWrapperDeserializer<W, M extends Map<K, V>, K , V> extends JsonDeserializer<W> implements ContextualDeserializer {
    
	// === abstract ===
    protected abstract MapWrapperDeserializer<W, M, K , V> instance();
    
    protected abstract W wrapCollection(M c);
    
    protected abstract Class<M> wrappedType();

    protected abstract Class<W> wrapperType();

	// === concrete ===
	protected JavaType keyType = null;
	protected JavaType valueType = null;

    @Override
    public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException {
    	MapWrapperDeserializer<W, M, K , V> deserializer = instance();
        if(property != null) {
        	deserializer.keyType = property.getType().containedType(0);
        	deserializer.valueType = property.getType().containedType(1);
        } else {
        	deserializer.keyType = ctxt.getContextualType().containedType(0);
        	deserializer.valueType = ctxt.getContextualType().containedType(1);
        }
		return deserializer;
    }
	
	@SuppressWarnings({ "unchecked" })
	@Override
	public W deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		ObjectCodec oc = p.getCodec();
		M inner = (keyType == null || valueType == null) ?
			(M) oc.readValue(p, wrappedType()) :
			(M) oc.readValue(p, TypeFactory.defaultInstance().constructMapType(wrappedType(), keyType, valueType));
		
		return wrapCollection(inner);
	}
	
	@Override
	public Class<W> handledType() {
		return wrapperType();
	}
	
}