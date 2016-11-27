package com.artclod.common.collect;


import java.util.HashMap;

import com.artclod.common.collect.HashFMap;
import com.artclod.jackson.databind.MapWrapperDeserializer;

public class HashFMapDeserializer extends MapWrapperDeserializer<HashFMap<?, ?>, HashMap<?, ?>, HashFMapDeserializer> {

	@Override
	protected HashFMapDeserializer instance() {
		return new HashFMapDeserializer();
	}

	@Override
	protected HashFMap<?, ?> wrapCollection(HashMap<?, ?> c) {
		return new HashFMap<>(c);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<HashFMap<?, ?>> wrapperType() {
		return (Class) HashFMap.class;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<HashMap<?, ?>> wrappedType() {
		return (Class) HashMap.class;
	}
	
}