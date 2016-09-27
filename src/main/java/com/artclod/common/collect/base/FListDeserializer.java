package com.artclod.common.collect.base;

import com.artclod.common.collect.ArrayFList;
import com.artclod.common.collect.FList;

public class FListDeserializer extends CollectionWrapperDeserializer<FList<?>, FList<?>, FListDeserializer> {

	@Override
	protected FListDeserializer instance() {
		return new FListDeserializer();
	}

	@Override
	protected FList<?> wrapCollection(FList<?> c) {
		return new ArrayFList<>(c);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<FList<?>> wrapperType() {
		return (Class) FList.class;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<FList<?>> wrappedType() {
		return (Class) FList.class;
	}
	
}