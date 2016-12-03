package com.artclod.common.collect;


import java.util.HashMap;

import com.artclod.common.collect.HashFMap;
import com.artclod.jackson.databind.MapWrapperDeserializer;

public class HashFMapDeserializer<K, V> extends MapWrapperDeserializer<HashFMap<K, V>, HashMap<K, V>, K, V> {

	@Override
	protected HashFMapDeserializer<K, V> instance() {
		return new HashFMapDeserializer<>();
	}

	@Override
	protected HashFMap<K, V> wrapCollection(HashMap<K, V> c) {
		return new HashFMap<>(c);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<HashFMap<K, V>> wrapperType() {
		return (Class) HashFMap.class;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<HashMap<K, V>> wrappedType() {
		return (Class) HashMap.class;
	}
	
}