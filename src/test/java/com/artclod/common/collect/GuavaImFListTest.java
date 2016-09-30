package com.artclod.common.collect;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.artclod.common.collect.support.CollectionContains;
import com.artclod.common.collect.support.FCollectionContains;
import com.artclod.common.collect.support.FListContains;
import com.artclod.common.collect.support.GuavaImFListContains;
import com.artclod.common.collect.support.ImFListContains;
import com.artclod.common.collect.support.ListContains;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.json.SerializeDeserializeCollectionJsonContract;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GuavaImFListTest extends SerializeDeserializeCollectionJsonContract<GuavaImFList<?>> {

	public ObjectMapper objectMapper() {
		return Json.objectMapper();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Class<GuavaImFList<?>> type() {
		return (Class) GuavaImFList.class;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E> GuavaImFList<?> create(E... elements) {
		return GuavaImFList.create(elements);
	}

	@Test
	public void test_GuavaImFListContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	GuavaImFListContains object = new GuavaImFListContains(GuavaImFList.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	GuavaImFListContains deserialized = objectMapper.readValue(serialized, GuavaImFListContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_CollectionContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	CollectionContains object = new CollectionContains(GuavaImFList.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	CollectionContains deserialized = objectMapper.readValue(serialized, CollectionContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_FCollectionContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	FCollectionContains object = new FCollectionContains(GuavaImFList.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	FCollectionContains deserialized = objectMapper.readValue(serialized, FCollectionContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_FListContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	FListContains object = new FListContains(GuavaImFList.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	FListContains deserialized = objectMapper.readValue(serialized, FListContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_ImFListContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	ImFListContains object = new ImFListContains(GuavaImFList.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	ImFListContains deserialized = objectMapper.readValue(serialized, ImFListContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_ListContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	ListContains object = new ListContains(GuavaImFList.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	ListContains deserialized = objectMapper.readValue(serialized, ListContains.class);
        assertEquals(object, deserialized);
	}
	
}
