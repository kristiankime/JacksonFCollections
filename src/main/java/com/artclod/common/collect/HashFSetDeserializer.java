package com.artclod.common.collect;


import java.util.HashSet;

import com.artclod.common.collect.GuavaImFSet;
import com.artclod.common.collect.HashFSet;
import com.artclod.jackson.databind.CollectionWrapperDeserializer;

public class HashFSetDeserializer<E> extends CollectionWrapperDeserializer<HashFSet<E>, HashSet<E>, E> {

	@Override
	protected HashFSetDeserializer<E> createDeserializer() {
		return new HashFSetDeserializer<E>();
	}

	@Override
	protected HashFSet<E> wrapCollection(HashSet<E> c) {
		return new HashFSet<>(c);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<HashFSet<E>> wrapperType() {
		return (Class) GuavaImFSet.class;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<HashSet<E>> wrappedType() {
		return (Class) HashSet.class;
	}
	
}