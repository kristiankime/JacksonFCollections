package com.artclod.common.collect.base;

import java.io.IOException;

import com.artclod.common.collect.ArrayFList;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class ArrayFListSerializer extends JsonSerializer<ArrayFList<?>>  {
	
	@Override
	public void serialize(ArrayFList<?> value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
		gen.writeObject(value.inner);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class<ArrayFList<?>> handledType() {
		return (Class<ArrayFList<?>>) (Class) ArrayFList.class;
	}
	
}