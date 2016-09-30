package com.artclod.common.json;

import static org.junit.Assert.assertEquals;

import java.io.Serializable;
import java.util.List;

import org.junit.Test;

import com.artclod.common.collect.Json;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class SerializeDeserializeJsonContract<T extends Serializable> {

	public abstract Class<T> type();
	
	public abstract List<T> objects();
	
	public ObjectMapper objectMapper() {
		return Json.objectMapper();
	}
	
    @Test
    public void serializing_then_deserializing_to_json_produces_same_object() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	List<T> objects = objects();
    	
    	for(int i =0; i < objects.size(); i++) {
    		T object = objects.get(i);
    		String serialized = objectMapper.writeValueAsString(object);
    		T deserialized = objectMapper.readValue(serialized, type());
	        assertEquals(i + "th object failed equals", object, deserialized);
    	}
    }
	
    
}
