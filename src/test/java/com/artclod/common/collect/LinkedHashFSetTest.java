package com.artclod.common.collect;

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

}
