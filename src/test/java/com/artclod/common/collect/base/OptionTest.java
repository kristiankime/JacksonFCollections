package com.artclod.common.collect.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.artclod.common.collect.Json;
import com.fasterxml.jackson.databind.ObjectMapper;

public class OptionTest {

	public ObjectMapper objectMapper() {
		return Json.objectMapper();
	}
	
	@Test
	public void test_as_None() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	None<String> object = Option.<String> none();
    	String serialized = objectMapper.writeValueAsString(object);
    	Option<?> deserialized = objectMapper.readValue(serialized, Option.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_as_Some() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	Some<String> object = Option.<String> some("value");
    	String serialized = objectMapper.writeValueAsString(object);
    	Option<?> deserialized = objectMapper.readValue(serialized, Option.class);
        assertEquals(object, deserialized);
	}
	
}
