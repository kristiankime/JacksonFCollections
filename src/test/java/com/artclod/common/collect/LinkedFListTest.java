package com.artclod.common.collect;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.artclod.common.collect.support.CollectionContains;
import com.artclod.common.collect.support.FCollectionContains;
import com.artclod.common.collect.support.FListContains;
import com.artclod.common.collect.support.LinkedFListContains;
import com.artclod.common.collect.support.ListContains;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.json.SerializeDeserializeCollectionJsonContract;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LinkedFListTest extends SerializeDeserializeCollectionJsonContract<LinkedFList<?>> {

	public ObjectMapper objectMapper() {
		return Json.objectMapper();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Class<LinkedFList<?>> type() {
		return (Class) LinkedFList.class;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E> LinkedFList<?> create(E... elements) {
		return LinkedFList.create(elements);
	}

	@Test
	public void test_LinkedFListContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	LinkedFListContains object = new LinkedFListContains(LinkedFList.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	LinkedFListContains deserialized = objectMapper.readValue(serialized, LinkedFListContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_CollectionContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	CollectionContains object = new CollectionContains(LinkedFList.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	CollectionContains deserialized = objectMapper.readValue(serialized, CollectionContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_FCollectionContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	FCollectionContains object = new FCollectionContains(LinkedFList.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	FCollectionContains deserialized = objectMapper.readValue(serialized, FCollectionContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_FListContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	FListContains object = new FListContains(LinkedFList.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	FListContains deserialized = objectMapper.readValue(serialized, FListContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_ListContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	ListContains object = new ListContains(LinkedFList.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	ListContains deserialized = objectMapper.readValue(serialized, ListContains.class);
        assertEquals(object, deserialized);
	}
	
}
