package com.artclod.common.collect;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.artclod.common.collect.support.FSetContains;
import com.artclod.common.collect.support.HashFSetContains;
import com.artclod.common.collect.support.SetContains;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.json.SerializeDeserializeCollectionJsonContract;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HashFSetTest extends SerializeDeserializeCollectionJsonContract<HashFSet<?>> {

	public ObjectMapper objectMapper() {
		return Json.objectMapper();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Class<HashFSet<?>> type() {
		return (Class) HashFSet.class;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E> HashFSet<?> create(E... elements) {
		return HashFSet.create(elements);
	}

	@Test
	public void test_HashFSetContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	HashFSetContains object = new HashFSetContains(HashFSet.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	HashFSetContains deserialized = objectMapper.readValue(serialized, HashFSetContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_FSetContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	FSetContains object = new FSetContains(HashFSet.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	FSetContains deserialized = objectMapper.readValue(serialized, FSetContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_SetContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	SetContains object = new SetContains(HashFSet.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	SetContains deserialized = objectMapper.readValue(serialized, SetContains.class);
        assertEquals(object, deserialized);
	}
	
}
