package com.artclod.common.collect;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.artclod.common.collect.support.FMapContains;
import com.artclod.common.collect.support.LinkedHashFMapContains;
import com.artclod.common.collect.support.MapContains;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.ContainedString;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LinkedHashFMapTest {

	public ObjectMapper objectMapper() {
		return Json.objectMapper();
	}
	
	@Test
	public void test_LinkedHashFMap_with_strings() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	LinkedHashFMap<String, String> object = LinkedHashFMap.create("1", "A", "2", "B");
    	String serialized = objectMapper.writeValueAsString(object);
    	HashFMap<?, ?> deserialized = objectMapper.readValue(serialized, HashFMap.class);
        assertEquals(object, deserialized);
	}

	@Test
	public void test_LinkedHashFMapContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	LinkedHashFMapContains object = new LinkedHashFMapContains(LinkedHashFMap.create(new ContainedInteger(1), new ContainedString("A")));
    	String serialized = objectMapper.writeValueAsString(object);
    	LinkedHashFMapContains deserialized = objectMapper.readValue(serialized, LinkedHashFMapContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_FMapContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	FMapContains object = new FMapContains(LinkedHashFMap.create(new ContainedInteger(1), new ContainedString("A")));
    	String serialized = objectMapper.writeValueAsString(object);
    	FMapContains deserialized = objectMapper.readValue(serialized, FMapContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_MapContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	MapContains object = new MapContains(LinkedHashFMap.create(new ContainedInteger(1), new ContainedString("A")));
    	String serialized = objectMapper.writeValueAsString(object);
    	MapContains deserialized = objectMapper.readValue(serialized, MapContains.class);
        assertEquals(object, deserialized);
	}
	
}
