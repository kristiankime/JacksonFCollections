package com.artclod.common.collect;


import com.artclod.common.collect.GuavaImFMap;
import com.artclod.jackson.databind.MapWrapperDeserializer;
import com.google.common.collect.ImmutableMap;

public class GuavaImFMapDeserializer<K, V> extends MapWrapperDeserializer<GuavaImFMap<K, V>, ImmutableMap<K, V>, K, V> {

	@Override
	protected GuavaImFMapDeserializer<K, V> instance() {
		return new GuavaImFMapDeserializer<>();
	}

	@Override
	protected GuavaImFMap<K, V> wrapCollection(ImmutableMap<K, V> c) {
		return new GuavaImFMap<>(c);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<GuavaImFMap<K, V>> wrapperType() {
		return (Class) GuavaImFMap.class;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<ImmutableMap<K, V>> wrappedType() {
		return (Class) ImmutableMap.class;
	}
	
}