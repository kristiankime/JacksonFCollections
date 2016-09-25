package com.artclod.common.collect.base;

import java.io.IOException;

import com.artclod.common.collect.LinkedFList;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class LinkedFListSerializer extends JsonSerializer<LinkedFList<?>>  {
	
	@Override
	public void serialize(LinkedFList<?> value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
		gen.writeObject(value.inner);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class<LinkedFList<?>> handledType() {
		return (Class<LinkedFList<?>>) (Class) LinkedFList.class;
	}
	
}