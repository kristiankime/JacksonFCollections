package com.artclod.common.collect;

import java.io.IOException;

import com.artclod.common.collect.GuavaImFSet;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class GuavaImFSetSerializer extends JsonSerializer<GuavaImFSet<?>>  {
	
	@Override
	public void serialize(GuavaImFSet<?> value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
		gen.writeObject(value.inner);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class<GuavaImFSet<?>> handledType() {
		return (Class<GuavaImFSet<?>>) (Class) GuavaImFSet.class;
	}
	
}