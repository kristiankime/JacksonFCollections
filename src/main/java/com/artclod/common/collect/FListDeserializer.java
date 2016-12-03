package com.artclod.common.collect;

import com.artclod.common.collect.ArrayFList;
import com.artclod.common.collect.FList;
import com.artclod.jackson.databind.CollectionWrapperDeserializer;

public class FListDeserializer<E> extends CollectionWrapperDeserializer<FList<E>, FList<E>, E> {

	@Override
	protected FListDeserializer<E> createDeserializer() {
		return new FListDeserializer<>();
	}

	@Override
	protected FList<E> wrapCollection(FList<E> c) {
		return new ArrayFList<>(c);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<FList<E>> wrapperType() {
		return (Class) FList.class;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<FList<E>> wrappedType() {
		return (Class) FList.class;
	}
	
}