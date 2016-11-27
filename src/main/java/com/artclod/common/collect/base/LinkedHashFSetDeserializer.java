package com.artclod.common.collect.base;


import java.util.LinkedHashSet;

import com.artclod.common.collect.GuavaImFSet;
import com.artclod.common.collect.LinkedHashFSet;
import com.artclod.jackson.databind.CollectionWrapperDeserializer;

public class LinkedHashFSetDeserializer extends CollectionWrapperDeserializer<LinkedHashFSet<?>, LinkedHashSet<?>, LinkedHashFSetDeserializer> {

	@Override
	protected LinkedHashFSetDeserializer instance() {
		return new LinkedHashFSetDeserializer();
	}

	@Override
	protected LinkedHashFSet<?> wrapCollection(LinkedHashSet<?> c) {
		return new LinkedHashFSet<>(c);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<LinkedHashFSet<?>> wrapperType() {
		return (Class) GuavaImFSet.class;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<LinkedHashSet<?>> wrappedType() {
		return (Class) LinkedHashSet.class;
	}
	
}