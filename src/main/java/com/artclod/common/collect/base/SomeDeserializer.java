package com.artclod.common.collect.base;

import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonParseException;
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
public class SomeDeserializer extends JsonDeserializer<Some<?>> implements ContextualDeserializer {
	
	protected JavaType valueType = null;

    @Override
    public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException {
    	SomeDeserializer deserializer = new SomeDeserializer();
        if(property != null){
        	deserializer.valueType = property.getType().containedType(0);
        } else {
        	deserializer.valueType = ctxt.getContextualType().containedType(0);
        }
		return deserializer;
    }
	
	@Override
	public Some<?> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		ObjectCodec oc = p.getCodec();
		ArrayList<?> inner = (valueType == null) ?
			(ArrayList<?>) oc.readValue(p, ArrayList.class) :
			(ArrayList<?>) oc.readValue(p, TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, valueType));
		
		if(inner.size() != 1) {
			throw new JsonParseException(p, "Some had " + inner.size() + " elements, should have had 1");
		}
			
		return new Some<>(inner.get(0));
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Class<Some<?>> handledType() {
		return (Class) Some.class;
	}
	
}