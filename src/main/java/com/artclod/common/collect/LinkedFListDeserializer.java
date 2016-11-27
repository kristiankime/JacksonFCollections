package com.artclod.common.collect;

import java.util.LinkedList;

import com.artclod.common.collect.LinkedFList;
import com.artclod.jackson.databind.CollectionWrapperDeserializer;

public class LinkedFListDeserializer extends CollectionWrapperDeserializer<LinkedFList<?>, LinkedList<?>, LinkedFListDeserializer> {

	@Override
	protected LinkedFListDeserializer instance() {
		return new LinkedFListDeserializer();
	}

	@Override
	protected LinkedFList<?> wrapCollection(LinkedList<?> c) {
		return new LinkedFList<>(c);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<LinkedFList<?>> wrapperType() {
		return (Class) LinkedFList.class;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<LinkedList<?>> wrappedType() {
		return (Class) LinkedList.class;
	}
	
}