package com.artclod.common.collect.base;

import com.artclod.common.collect.ArrayFList;
import com.artclod.common.collect.FCollection;

public class FCollectionDeserializer extends CollectionWrapperDeserializer<FCollection<?>, FCollection<?>, FCollectionDeserializer> {

	@Override
	protected FCollectionDeserializer instance() {
		return new FCollectionDeserializer();
	}

	@Override
	protected FCollection<?> wrapCollection(FCollection<?> c) {
		return new ArrayFList<>(c);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<FCollection<?>> wrapperType() {
		return (Class) FCollection.class;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<FCollection<?>> wrappedType() {
		return (Class) FCollection.class;
	}
	
}