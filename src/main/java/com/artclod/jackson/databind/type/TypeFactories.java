package com.artclod.jackson.databind.type;

import java.util.Collection;

import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class TypeFactories {

	/**
	 * Returns a collection type assuming that the classes are "simple" ie we don't need complicated nested types.
	 * uses the default {@link TypeFactory}.
	 * 
	 * @param collectionClass the class of the collection
	 * @param elementClass the class of the elements in the collection (this can not nest additional types)
	 * @return The CollectionType
	 */
	public static <C extends Collection<?>, E> CollectionType simpleCollectionType(Class<C> collectionClass, Class<E> elementClass) {
		TypeFactory typeFactory = TypeFactory.defaultInstance(); 
    	return typeFactory.constructCollectionType(collectionClass, typeFactory.constructType(elementClass));
	}

	/**
	 * Returns a collection type assuming that the classes are "simple" ie we don't need complicated nested types.
	 * 
	 * @param typeFactory the {@link TypeFactory} to use to resolve types.
	 * @param collectionClass the class of the collection
	 * @param elementClass the class of the elements in the collection (this can not nest additional types)
	 * @return The CollectionType
	 */
	public static <C extends Collection<?>, E> CollectionType simpleCollectionType(TypeFactory typeFactory, Class<C> collectionClass, Class<E> elementClass) {
    	return  typeFactory.constructCollectionType(collectionClass, typeFactory.constructType(elementClass));
	}
	
}
