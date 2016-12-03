package com.artclod.common.collect;

import com.artclod.common.collect.ArrayFList;
import com.artclod.common.collect.FCollection;
import com.artclod.jackson.databind.CollectionWrapperDeserializer;

public class FCollectionDeserializer<E> extends CollectionWrapperDeserializer<FCollection<E>, FCollection<E>, E> {

	@Override
	protected FCollectionDeserializer<E> createDeserializer() {
		return new FCollectionDeserializer<>();
	}

	@Override
	protected FCollection<E> wrapCollection(FCollection<E> c) {
		return new ArrayFList<>(c);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<FCollection<E>> wrapperType() {
		return (Class) FCollection.class;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected Class<FCollection<E>> wrappedType() {
		return (Class) FCollection.class;
	}
	
}