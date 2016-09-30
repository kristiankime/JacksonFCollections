package com.artclod.common.collect;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.artclod.common.collect.support.ArrayFListContains;
import com.artclod.common.collect.support.CollectionContains;
import com.artclod.common.collect.support.FCollectionContains;
import com.artclod.common.collect.support.FListContains;
import com.artclod.common.collect.support.ListContains;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.json.SerializeDeserializeCollectionJsonContract;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ArrayFListTest extends SerializeDeserializeCollectionJsonContract<ArrayFList<?>> {

	public ObjectMapper objectMapper() {
		return Json.objectMapper();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Class<ArrayFList<?>> type() {
		return (Class) ArrayFList.class;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E> ArrayFList<?> create(E... elements) {
		return ArrayFList.create(elements);
	}
	
//	@Test
//	public void json_roundtrip_with_nested_objects_string() throws Exception {
//    	ObjectMapper objectMapper = objectMapper();
//    	ContainsArrayFList object = new ContainsArrayFList(ArrayFList.create(new ContainedInteger(1)));
//		String serialized = objectMapper.writeValueAsString(object);
//		ContainsArrayFList deserialized = objectMapper.readValue(serialized, ContainsArrayFList.class);
//        assertEquals(object, deserialized);
//	}
	
	@Test
	public void test_ArrayFListContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	ArrayFListContains object = new ArrayFListContains(ArrayFList.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	ArrayFListContains deserialized = objectMapper.readValue(serialized, ArrayFListContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_CollectionContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	CollectionContains object = new CollectionContains(ArrayFList.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	CollectionContains deserialized = objectMapper.readValue(serialized, CollectionContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_FCollectionContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	FCollectionContains object = new FCollectionContains(ArrayFList.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	FCollectionContains deserialized = objectMapper.readValue(serialized, FCollectionContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_FListContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	FListContains object = new FListContains(ArrayFList.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	FListContains deserialized = objectMapper.readValue(serialized, FListContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_ListContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	ListContains object = new ListContains(ArrayFList.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	ListContains deserialized = objectMapper.readValue(serialized, ListContains.class);
        assertEquals(object, deserialized);
	}
	
}
