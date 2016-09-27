package com.artclod.common.collect;

import java.util.ArrayList;

import com.artclod.common.FCollectionModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.guava.GuavaModule;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;

public class Json {

	public static ObjectMapper objectMapper() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		mapper.registerModule(new GuavaModule());
		mapper.registerModule(new Jdk8Module());
		mapper.registerModule(new FCollectionModule());
		
		mapper.getTypeFactory().constructCollectionType(ArrayList.class, String.class);
		
		return mapper;
	}
	
}
