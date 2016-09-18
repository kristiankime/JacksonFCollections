package com.artclod.common.collect.base;

import java.io.IOException;
import java.util.ArrayList;

import com.artclod.common.collect.ArrayFList;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;

//http://stackoverflow.com/questions/36159677/how-to-create-a-custom-deserializer-in-jackson-for-a-generic-type
@SuppressWarnings("rawtypes")
public class ArrayFListDeserializer extends JsonDeserializer<ArrayFList> implements ContextualDeserializer {
    private JavaType valueType;

    @Override
    public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException {
        JavaType wrapperType = property.getType();
        JavaType valueType = wrapperType.containedType(0);
        ArrayFListDeserializer deserializer = new ArrayFListDeserializer();
        deserializer.valueType = valueType;
        return deserializer;
    }
	
	@SuppressWarnings("unchecked")
	@Override
	public ArrayFList deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		ObjectCodec oc = p.getCodec();
		CollectionType collectionType = CollectionType.construct(ArrayList.class, valueType);
		ArrayList inner = (ArrayList) oc.readValue(p, collectionType);
		return new ArrayFList(inner);
	}
	
	@Override
	public Class<?> handledType() {
		return ArrayFList.class;
	}
	
}