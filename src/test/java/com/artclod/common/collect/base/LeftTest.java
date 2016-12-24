package com.artclod.common.collect.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.artclod.common.collect.Json;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LeftTest  {

	public ObjectMapper objectMapper() {
		return Json.objectMapper();
	}
	
	@Test
	public void test_Left() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	Left<String, Object> object = Either.left("value");
    	String serialized = objectMapper.writeValueAsString(object);
    	Left<?, ?> deserialized = objectMapper.readValue(serialized, Left.class);
        assertEquals(object, deserialized);
	}
	
}
