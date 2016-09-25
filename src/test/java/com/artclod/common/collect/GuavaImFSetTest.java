package com.artclod.common.collect;

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

}
