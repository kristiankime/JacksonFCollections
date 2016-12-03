package com.artclod.common.collect;

import java.util.LinkedList;

import com.artclod.common.collect.LinkedFList;
import com.artclod.jackson.databind.CollectionWrapperDeserializer;

public class LinkedFListDeserializer<E> extends CollectionWrapperDeserializer<LinkedFList<E>, LinkedList<E>, E> {

	@Override
	protected LinkedFListDeserializer<E> createDeserializer() {
		return new LinkedFListDeserializer<>();
	}

	@Override
	protected LinkedFList<E> wrapCollection(LinkedList<E> c) {
		return new LinkedFList<>(c);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<LinkedFList<E>> wrapperType() {
		return (Class) LinkedFList.class;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<LinkedList<E>> wrappedType() {
		return (Class) LinkedList.class;
	}
	
}