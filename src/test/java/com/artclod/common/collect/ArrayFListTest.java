package com.artclod.common.collect;

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

}
