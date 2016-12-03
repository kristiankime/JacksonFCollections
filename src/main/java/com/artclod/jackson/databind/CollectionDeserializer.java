package com.artclod.jackson.databind;

import java.io.IOException;
import java.util.ArrayList;
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

//http://stackoverflow.com/questions/36159677/how-to-create-a-custom-deserializer-in-jackson-for-a-generic-type
public abstract class CollectionDeserializer<C extends Collection<E>, E> extends JsonDeserializer<C> implements ContextualDeserializer {

	// === abstract ===
    protected abstract CollectionDeserializer<C, E> createDeserializer();

	protected abstract C createCollection(Collection<E> data);	
	
	protected abstract Class<C> collectionType();

	protected JavaType valueType = null;
	
	// === concrete ===
    @Override
    public JsonDeserializer<C> createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException {
    	CollectionDeserializer<C, E> deserializer = createDeserializer();
        if(property != null){
        	deserializer.valueType = property.getType().getSuperClass().containedType(0);  
        } else {
        	deserializer.valueType = ctxt.getContextualType().containedType(0);
        }
		return deserializer;
    }
    
    @SuppressWarnings("unchecked")
	@Override
	public C deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		ObjectCodec oc = p.getCodec();
		ArrayList<?> data = (valueType == null) ?
			(ArrayList<?>) oc.readValue(p, ArrayList.class) :
			(ArrayList<?>) oc.readValue(p, TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, valueType));
		return createCollection((Collection<E>) data);
	}
	
	@Override
	public Class<C> handledType() {
		return collectionType();
	}
	
}