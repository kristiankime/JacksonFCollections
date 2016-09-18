package com.artclod.common.collect.base;

import java.util.ArrayList;

import com.artclod.common.collect.ArrayFList;

public class ArrayFListDeserializer extends CollectionWrapperDeserializer<ArrayFList<?>, ArrayList<?>, ArrayFListDeserializer> {

	@Override
	protected ArrayFListDeserializer instance() {
		return new ArrayFListDeserializer();
	}

	@Override
	protected ArrayFList<?> wrapCollection(ArrayList<?> c) {
		return new ArrayFList<>(c);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<ArrayFList<?>> wrapperType() {
		return (Class) ArrayFList.class;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<ArrayList<?>> wrappedType() {
		return (Class) ArrayList.class;
	}
	
}