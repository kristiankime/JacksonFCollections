package com.artclod.common.collect.base;


import com.artclod.common.collect.GuavaImFSet;
import com.google.common.collect.ImmutableSet;

public class GuavaImFSetDeserializer extends CollectionWrapperDeserializer<GuavaImFSet<?>, ImmutableSet<?>, GuavaImFSetDeserializer> {

	@Override
	protected GuavaImFSetDeserializer instance() {
		return new GuavaImFSetDeserializer();
	}

	@Override
	protected GuavaImFSet<?> wrapCollection(ImmutableSet<?> c) {
		return new GuavaImFSet<>(c);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<GuavaImFSet<?>> wrapperType() {
		return (Class) GuavaImFSet.class;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<ImmutableSet<?>> wrappedType() {
		return (Class) ImmutableSet.class;
	}
	
}