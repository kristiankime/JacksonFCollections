package com.artclod.common.collect.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.artclod.common.collect.Json;
import com.artclod.common.collect.support.OptionContains;
import com.artclod.common.collect.support.SomeContains;
import com.artclod.common.collect.util.ContainedInteger;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SomeTest  {

	public ObjectMapper objectMapper() {
		return Json.objectMapper();
	}
	
	@Test
	public void test_Some() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	Some<String> object = Option.some("A");
    	String serialized = objectMapper.writeValueAsString(object);
    	Some<?> deserialized = objectMapper.readValue(serialized, Some.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_SomeContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	SomeContains object = new SomeContains(Option.some(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	SomeContains deserialized = objectMapper.readValue(serialized, SomeContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_OptionContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	OptionContains object = new OptionContains(Option.some(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	OptionContains deserialized = objectMapper.readValue(serialized, OptionContains.class);
        assertEquals(object, deserialized);
	}
	
}
