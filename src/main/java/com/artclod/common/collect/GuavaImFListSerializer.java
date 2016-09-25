package com.artclod.common.collect;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class GuavaImFListSerializer extends JsonSerializer<GuavaImFList<?>>  {
	
	@Override
	public void serialize(GuavaImFList<?> value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
		gen.writeObject(value.inner);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class<GuavaImFList<?>> handledType() {
		return (Class<GuavaImFList<?>>) (Class) GuavaImFList.class;
	}
	
}