package com.artclod.common.collect;

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

}
