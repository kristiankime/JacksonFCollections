package com.artclod.common.collect;

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

}
