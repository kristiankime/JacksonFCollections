package com.artclod.common.collect;


import com.artclod.common.collect.GuavaImFList;
import com.artclod.jackson.databind.CollectionWrapperDeserializer;
import com.google.common.collect.ImmutableList;

public class GuavaImFListDeserializer<E> extends CollectionWrapperDeserializer<GuavaImFList<E>, ImmutableList<E>, E> {

	@Override
	protected GuavaImFListDeserializer<E> createDeserializer() {
		return new GuavaImFListDeserializer<>();
	}

	@Override
	protected GuavaImFList<E> wrapCollection(ImmutableList<E> c) {
		return new GuavaImFList<>(c);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<GuavaImFList<E>> wrapperType() {
		return (Class) GuavaImFList.class;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<ImmutableList<E>> wrappedType() {
		return (Class) ImmutableList.class;
	}
	
}