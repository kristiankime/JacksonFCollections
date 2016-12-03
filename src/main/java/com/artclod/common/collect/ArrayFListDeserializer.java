package com.artclod.common.collect;

import java.util.ArrayList;

import com.artclod.common.collect.ArrayFList;
import com.artclod.jackson.databind.CollectionWrapperDeserializer;

public class ArrayFListDeserializer<E> extends CollectionWrapperDeserializer<ArrayFList<?>, ArrayList<E>, E> {

	@Override
	protected ArrayFListDeserializer<E> createDeserializer() {
		return new ArrayFListDeserializer<>();
	}

	@Override
	protected ArrayFList<E> wrapCollection(ArrayList<E> c) {
		return new ArrayFList<>(c);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<ArrayFList<?>> wrapperType() {
		return (Class) ArrayFList.class;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<ArrayList<E>> wrappedType() {
		return (Class) ArrayList.class;
	}
	
}