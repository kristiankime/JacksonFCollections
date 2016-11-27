package com.artclod.common.collect.base;

import java.io.IOException;
import java.util.Collection;

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
 * This class handles of the needs of json deserialization for a class that is simply a wrapper around an existing Java Collection that already has a deserializer.
 * For example {@link com.artclod.common.collect.ArrayFList} is a wrapper around {@link java.util.ArrayList} so this class can easily provide a deserializer for it.
 * 
 * @param <W> The wrapper collection type
 * @param <C> The wrapped collection type
 * @param <THIS> The concrete deserializer type (should be the type of the class that is extending this one)
 */
//http://stackoverflow.com/questions/36159677/how-to-create-a-custom-deserializer-in-jackson-for-a-generic-type
public abstract class CollectionWrapperDeserializer<W, C extends Collection<?>, THIS extends CollectionWrapperDeserializer<W, C, THIS>> extends JsonDeserializer<W> implements ContextualDeserializer {
    public static String VALUE = "value";
	
	protected JavaType valueType = null;
    
    protected abstract THIS instance();
    
    protected abstract W wrapCollection(C c);
    
    protected abstract Class<C> wrappedType();

    protected abstract Class<W> wrapperType();

    @Override
    public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException {
        THIS deserializer = instance();
        if(property != null){
        	deserializer.valueType = property.getType().containedType(0);
        }
		return deserializer;
    }
	
	@SuppressWarnings({ "unchecked" })
	@Override
	public W deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		ObjectCodec oc = p.getCodec();
		C inner = (valueType == null) ?
			(C) oc.readValue(p, wrappedType()) :
			(C) oc.readValue(p, TypeFactory.defaultInstance().constructCollectionType(wrappedType(), valueType));
		return wrapCollection(inner);
	}
	
	@Override
	public Class<W> handledType() {
		return wrapperType();
	}
	
}