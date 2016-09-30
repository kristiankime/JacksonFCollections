package com.artclod.common.collect;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.artclod.common.collect.support.ArrayListContains;
import com.artclod.common.collect.support.CollectionContains;
import com.artclod.common.collect.support.ListContains;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.json.SerializeDeserializeCollectionJsonContract;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;

public class ArrayListTest extends SerializeDeserializeCollectionJsonContract<ArrayList<?>> {

	public ObjectMapper objectMapper() {
		return Json.objectMapper();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Class<ArrayList<?>> type() {
		return (Class) ArrayFList.class;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E> ArrayList<?> create(E... elements) {
		return Lists.newArrayList(elements);
	}
	
	@Test
	public void test_ArrayListContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	ArrayListContains object = new ArrayListContains(Lists.newArrayList(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	ArrayListContains deserialized = objectMapper.readValue(serialized, ArrayListContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_ListContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	ListContains object = new ListContains(Lists.newArrayList(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	ListContains deserialized = objectMapper.readValue(serialized, ListContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_CollectionContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	CollectionContains object = new CollectionContains(Lists.newArrayList(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	CollectionContains deserialized = objectMapper.readValue(serialized, CollectionContains.class);
        assertEquals(object, deserialized);
	}
	
}
