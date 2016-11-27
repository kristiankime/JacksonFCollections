package com.artclod.common.collect;


import java.util.LinkedHashMap;

import com.artclod.common.collect.LinkedHashFMap;
import com.artclod.jackson.databind.MapWrapperDeserializer;

public class LinkedHashFMapDeserializer extends MapWrapperDeserializer<LinkedHashFMap<?, ?>, LinkedHashMap<?, ?>, LinkedHashFMapDeserializer> {

	@Override
	protected LinkedHashFMapDeserializer instance() {
		return new LinkedHashFMapDeserializer();
	}

	@Override
	protected LinkedHashFMap<?, ?> wrapCollection(LinkedHashMap<?, ?> c) {
		return new LinkedHashFMap<>(c);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<LinkedHashFMap<?, ?>> wrapperType() {
		return (Class) LinkedHashFMap.class;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<LinkedHashMap<?, ?>> wrappedType() {
		return (Class) LinkedHashMap.class;
	}
	
}