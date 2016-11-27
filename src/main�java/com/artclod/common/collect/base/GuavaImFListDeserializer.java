package com.artclod.common.collect.base;


import com.artclod.common.collect.GuavaImFList;
import com.artclod.jackson.databind.CollectionWrapperDeserializer;
import com.google.common.collect.ImmutableList;

public class GuavaImFListDeserializer extends CollectionWrapperDeserializer<GuavaImFList<?>, ImmutableList<?>, GuavaImFListDeserializer> {

	@Override
	protected GuavaImFListDeserializer instance() {
		return new GuavaImFListDeserializer();
	}

	@Override
	protected GuavaImFList<?> wrapCollection(ImmutableList<?> c) {
		return new GuavaImFList<>(c);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<GuavaImFList<?>> wrapperType() {
		return (Class) GuavaImFList.class;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<ImmutableList<?>> wrappedType() {
		return (Class) ImmutableList.class;
	}
	
}