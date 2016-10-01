package com.artclod.common.collect.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.artclod.common.collect.Json;
import com.artclod.common.collect.support.NoneContains;
import com.artclod.common.collect.support.OptionContains;
import com.artclod.common.collect.util.ContainedInteger;
import com.fasterxml.jackson.databind.ObjectMapper;

public class NoneTest  {

	public ObjectMapper objectMapper() {
		return Json.objectMapper();
	}
	
	@Test
	public void test_None() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	None<String> object = Option.<String> none();
    	String serialized = objectMapper.writeValueAsString(object);
    	None<?> deserialized = objectMapper.readValue(serialized, None.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_NoneContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	NoneContains object = new NoneContains(Option.<ContainedInteger> none());
    	String serialized = objectMapper.writeValueAsString(object);
    	NoneContains deserialized = objectMapper.readValue(serialized, NoneContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_OptionContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	OptionContains object = new OptionContains(Option.<ContainedInteger> none());
    	String serialized = objectMapper.writeValueAsString(object);
    	OptionContains deserialized = objectMapper.readValue(serialized, OptionContains.class);
        assertEquals(object, deserialized);
	}
	
}
