package com.artclod.common.collect;

import java.io.IOException;

import com.artclod.common.FCollectionModule;
import com.artclod.common.collect.util.ContainedInteger;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.guava.GuavaModule;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;

public class Json {

	public static ObjectMapper objectMapper() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		mapper.registerModule(new GuavaModule());
		mapper.registerModule(new Jdk8Module());
		FCollectionModule module = new FCollectionModule();
		mapper.registerModule(module);
		
		SimpleModule simpleModule = new SimpleModule();
		simpleModule.addKeySerializer(ContainedInteger.class, new ContainedIntegerSerializer());
		simpleModule.addKeyDeserializer(ContainedInteger.class, new ContainedIntegerKeyDeserializer());
		mapper.registerModule(simpleModule);
		
		return mapper;
	}
	
	
	private static class ContainedIntegerSerializer extends JsonSerializer<ContainedInteger>{
	  @Override
	  public void serialize(ContainedInteger value, JsonGenerator jgen, SerializerProvider provider)  throws IOException, JsonProcessingException {
	    jgen.writeFieldName(String.valueOf(value.getValue()));
	  }
	}
	
	private static class ContainedIntegerKeyDeserializer extends KeyDeserializer {
		@Override
		public Object deserializeKey(String key, DeserializationContext ctxt) throws IOException, JsonProcessingException {
			return new ContainedInteger(Integer.parseInt(key));
		}
	}
	
}
