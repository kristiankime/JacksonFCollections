package com.artclod.common.collect.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.artclod.common.collect.Json;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RightTest  {

	public ObjectMapper objectMapper() {
		return Json.objectMapper();
	}
	
	@Test
	public void test_Left() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	Right<String, Object> object = Either.right("value");
    	String serialized = objectMapper.writeValueAsString(object);
    	Right<?, ?> deserialized = objectMapper.readValue(serialized, Right.class);
        assertEquals(object, deserialized);
	}
	
}
