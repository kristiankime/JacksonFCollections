package com.artclod.common.collect;


import java.util.HashSet;

import com.artclod.common.collect.GuavaImFSet;
import com.artclod.common.collect.HashFSet;
import com.artclod.jackson.databind.CollectionWrapperDeserializer;

public class HashFSetDeserializer extends CollectionWrapperDeserializer<HashFSet<?>, HashSet<?>, HashFSetDeserializer> {

	@Override
	protected HashFSetDeserializer instance() {
		return new HashFSetDeserializer();
	}

	@Override
	protected HashFSet<?> wrapCollection(HashSet<?> c) {
		return new HashFSet<>(c);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<HashFSet<?>> wrapperType() {
		return (Class) GuavaImFSet.class;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<HashSet<?>> wrappedType() {
		return (Class) HashSet.class;
	}
	
}