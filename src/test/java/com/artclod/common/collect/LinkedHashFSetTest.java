package com.artclod.common.collect;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.artclod.common.collect.support.FSetContains;
import com.artclod.common.collect.support.LinkedHashFSetContains;
import com.artclod.common.collect.support.SetContains;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.json.SerializeDeserializeCollectionJsonContract;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LinkedHashFSetTest extends SerializeDeserializeCollectionJsonContract<LinkedHashFSet<?>> {

	public ObjectMapper objectMapper() {
		return Json.objectMapper();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Class<LinkedHashFSet<?>> type() {
		return (Class) LinkedHashFSet.class;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E> LinkedHashFSet<?> create(E... elements) {
		return LinkedHashFSet.create(elements);
	}

	@Test
	public void test_LinkedHashFSetContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	LinkedHashFSetContains object = new LinkedHashFSetContains(LinkedHashFSet.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	LinkedHashFSetContains deserialized = objectMapper.readValue(serialized, LinkedHashFSetContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_FSetContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	FSetContains object = new FSetContains(LinkedHashFSet.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	FSetContains deserialized = objectMapper.readValue(serialized, FSetContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_SetContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	SetContains object = new SetContains(LinkedHashFSet.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	SetContains deserialized = objectMapper.readValue(serialized, SetContains.class);
        assertEquals(object, deserialized);
	}
	
}
