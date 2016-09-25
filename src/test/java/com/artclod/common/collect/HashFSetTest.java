package com.artclod.common.collect;

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

}
