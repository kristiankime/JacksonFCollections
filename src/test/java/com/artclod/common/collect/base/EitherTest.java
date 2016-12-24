package com.artclod.common.collect.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.artclod.common.collect.Json;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EitherTest {

	public ObjectMapper objectMapper() {
		return Json.objectMapper();
	}
	
	@Test
	public void test_as_Left() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	Left<String, Object> object = Either.left("value");
    	String serialized = objectMapper.writeValueAsString(object);
    	Either<?, ?> deserialized = objectMapper.readValue(serialized, Either.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_as_Right() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	Right<String, Object> object = Either.right("value");
    	String serialized = objectMapper.writeValueAsString(object);
    	Either<?, ?> deserialized = objectMapper.readValue(serialized, Either.class);
        assertEquals(object, deserialized);
	}
	
}
