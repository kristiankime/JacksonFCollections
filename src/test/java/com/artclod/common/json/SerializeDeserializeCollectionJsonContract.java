package com.artclod.common.json;

import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class SerializeDeserializeCollectionJsonContract<T extends Collection<?>> {

	public abstract Class<T> type();
		
	@SuppressWarnings("unchecked")
	public abstract <E> T create(E... elements);
	
	public abstract ObjectMapper objectMapper();
	
    @Test
    public void json_roundtrip_with_strings() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	T object = create("a", "b", "c");
    	String serialized = objectMapper.writeValueAsString(object);
		T deserialized = objectMapper.readValue(serialized, type());
        assertEquals(object, deserialized);
    }
    
    @Test
    public void json_roundtrip_with_integers() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	T object = create(1, 2, 3);
    	String serialized = objectMapper.writeValueAsString(object);
		T deserialized = objectMapper.readValue(serialized, type());
        assertEquals(object, deserialized);
    }
	
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	@Test
//	public void json_roundtrip_with_nested_objects_integers() throws Exception {
//    	ObjectMapper objectMapper = objectMapper();
//		Contains object = new Contains((FCollection) create(new ContainedString("a")));
//		String serialized = objectMapper.writeValueAsString(object);
//		Contains deserialized = objectMapper.readValue(serialized, Contains.class);
//        assertEquals(object, deserialized);
//	}
//	
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	@Test
//	public void json_roundtrip_with_nested_objects_string() throws Exception {
//    	ObjectMapper objectMapper = objectMapper();
//		Contains object = new Contains((FCollection) create(new ContainedInteger(1)));
//		String serialized = objectMapper.writeValueAsString(object);
//		Contains deserialized = objectMapper.readValue(serialized, Contains.class);
//        assertEquals(object, deserialized);
//	}
    
}
