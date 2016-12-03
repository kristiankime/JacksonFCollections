package com.artclod.common.collect;


import java.util.LinkedHashMap;

import com.artclod.common.collect.LinkedHashFMap;
import com.artclod.jackson.databind.MapWrapperDeserializer;

public class LinkedHashFMapDeserializer<K, V> extends MapWrapperDeserializer<LinkedHashFMap<K, V>, LinkedHashMap<K, V>, K, V> {

	@Override
	protected LinkedHashFMapDeserializer<K, V> instance() {
		return new LinkedHashFMapDeserializer<>();
	}

	@Override
	protected LinkedHashFMap<K, V> wrapCollection(LinkedHashMap<K, V> c) {
		return new LinkedHashFMap<>(c);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<LinkedHashFMap<K, V>> wrapperType() {
		return (Class) LinkedHashFMap.class;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<LinkedHashMap<K, V>> wrappedType() {
		return (Class) LinkedHashMap.class;
	}
	
}