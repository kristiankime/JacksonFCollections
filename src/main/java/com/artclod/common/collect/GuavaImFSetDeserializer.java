package com.artclod.common.collect;


import com.artclod.common.collect.GuavaImFSet;
import com.artclod.jackson.databind.CollectionWrapperDeserializer;
import com.google.common.collect.ImmutableSet;

public class GuavaImFSetDeserializer<E> extends CollectionWrapperDeserializer<GuavaImFSet<E>, ImmutableSet<E>, E> {

	@Override
	protected GuavaImFSetDeserializer<E> createDeserializer() {
		return new GuavaImFSetDeserializer<>();
	}

	@Override
	protected GuavaImFSet<E> wrapCollection(ImmutableSet<E> c) {
		return new GuavaImFSet<>(c);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<GuavaImFSet<E>> wrapperType() {
		return (Class) GuavaImFSet.class;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<ImmutableSet<E>> wrappedType() {
		return (Class) ImmutableSet.class;
	}
	
}