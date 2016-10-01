package com.artclod.common.collect.base;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class NoneDeserializer extends JsonDeserializer<com.artclod.common.collect.base.None<?>> {
	
	@Override
	public com.artclod.common.collect.base.None<?> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {	
		return com.artclod.common.collect.base.None.INSTANCE;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Class<com.artclod.common.collect.base.None<?>> handledType() {
		return (Class) com.artclod.common.collect.base.None.class;
	}
	
}