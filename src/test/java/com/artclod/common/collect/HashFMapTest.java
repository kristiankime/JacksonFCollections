package com.artclod.common.collect;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.artclod.common.collect.support.FMapContains;
import com.artclod.common.collect.support.HashFMapContains;
import com.artclod.common.collect.support.MapContains;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.ContainedString;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HashFMapTest {

	public ObjectMapper objectMapper() {
		return Json.objectMapper();
	}
	
	@Test
	public void test_HashFMap_with_strings() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	HashFMap<String, String> object = HashFMap.create("1", "A", "2", "B");
    	String serialized = objectMapper.writeValueAsString(object);
    	HashFMap<?, ?> deserialized = objectMapper.readValue(serialized, HashFMap.class);
        assertEquals(object, deserialized);
	}

	@Test
	public void test_HashFMapContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	HashFMapContains object = new HashFMapContains(HashFMap.create(new ContainedInteger(1), new ContainedString("A")));
    	String serialized = objectMapper.writeValueAsString(object);
    	HashFMapContains deserialized = objectMapper.readValue(serialized, HashFMapContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_FMapContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	FMapContains object = new FMapContains(HashFMap.create(new ContainedInteger(1), new ContainedString("A")));
    	String serialized = objectMapper.writeValueAsString(object);
    	FMapContains deserialized = objectMapper.readValue(serialized, FMapContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_MapContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	MapContains object = new MapContains(HashFMap.create(new ContainedInteger(1), new ContainedString("A")));
    	String serialized = objectMapper.writeValueAsString(object);
    	MapContains deserialized = objectMapper.readValue(serialized, MapContains.class);
        assertEquals(object, deserialized);
	}
	
}
