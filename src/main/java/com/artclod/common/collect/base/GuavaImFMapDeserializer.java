package com.artclod.common.collect.base;


import com.artclod.common.collect.GuavaImFMap;
import com.google.common.collect.ImmutableMap;

public class GuavaImFMapDeserializer extends MapWrapperDeserializer<GuavaImFMap<?, ?>, ImmutableMap<?, ?>, GuavaImFMapDeserializer> {

	@Override
	protected GuavaImFMapDeserializer instance() {
		return new GuavaImFMapDeserializer();
	}

	@Override
	protected GuavaImFMap<?, ?> wrapCollection(ImmutableMap<?, ?> c) {
		return new GuavaImFMap<>(c);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<GuavaImFMap<?, ?>> wrapperType() {
		return (Class) GuavaImFMap.class;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<ImmutableMap<?, ?>> wrappedType() {
		return (Class) ImmutableMap.class;
	}
	
}