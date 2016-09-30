package com.artclod.common.collect;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.artclod.common.collect.support.FSetContains;
import com.artclod.common.collect.support.GuavaImFSetContains;
import com.artclod.common.collect.support.ImFSetContains;
import com.artclod.common.collect.support.SetContains;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.json.SerializeDeserializeCollectionJsonContract;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GuavaImFSetTest extends SerializeDeserializeCollectionJsonContract<GuavaImFSet<?>> {

	public ObjectMapper objectMapper() {
		return Json.objectMapper();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Class<GuavaImFSet<?>> type() {
		return (Class) GuavaImFSet.class;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E> GuavaImFSet<?> create(E... elements) {
		return GuavaImFSet.create(elements);
	}
	
	@Test
	public void test_GuavaImFSetContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	GuavaImFSetContains object = new GuavaImFSetContains(GuavaImFSet.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	GuavaImFSetContains deserialized = objectMapper.readValue(serialized, GuavaImFSetContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_FSetContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	FSetContains object = new FSetContains(GuavaImFSet.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	FSetContains deserialized = objectMapper.readValue(serialized, FSetContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_ImFSetContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	ImFSetContains object = new ImFSetContains(GuavaImFSet.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	ImFSetContains deserialized = objectMapper.readValue(serialized, ImFSetContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_SetContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	SetContains object = new SetContains(GuavaImFSet.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	SetContains deserialized = objectMapper.readValue(serialized, SetContains.class);
        assertEquals(object, deserialized);
	}
	
}
