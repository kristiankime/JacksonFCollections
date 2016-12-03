package com.artclod.common.collect;


import java.util.LinkedHashSet;

import com.artclod.common.collect.GuavaImFSet;
import com.artclod.common.collect.LinkedHashFSet;
import com.artclod.jackson.databind.CollectionWrapperDeserializer;

public class LinkedHashFSetDeserializer<E> extends CollectionWrapperDeserializer<LinkedHashFSet<E>, LinkedHashSet<E>, E> {

	@Override
	protected LinkedHashFSetDeserializer<E> createDeserializer() {
		return new LinkedHashFSetDeserializer<>();
	}

	@Override
	protected LinkedHashFSet<E> wrapCollection(LinkedHashSet<E> c) {
		return new LinkedHashFSet<>(c);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<LinkedHashFSet<E>> wrapperType() {
		return (Class) GuavaImFSet.class;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<LinkedHashSet<E>> wrappedType() {
		return (Class) LinkedHashSet.class;
	}
	
}