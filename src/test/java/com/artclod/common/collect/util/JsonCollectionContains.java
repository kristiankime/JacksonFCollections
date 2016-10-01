package com.artclod.common.collect.util;

import java.util.Collection;

public abstract class JsonCollectionContains<C extends Collection<E>, E> {
	private C collection = null;

	public JsonCollectionContains() {
		//
	}
	
	public JsonCollectionContains(C collection) {
		this.collection = collection;
	}

	public C getCollection() {
		return collection;
	}

	public void setCollection(C collection) {
		this.collection = collection;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((collection == null) ? 0 : collection.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JsonCollectionContains<?, ?> other = (JsonCollectionContains<?, ?>) obj;
		if (collection == null) {
			if (other.collection != null)
				return false;
		} else if (!collection.equals(other.collection))
			return false;
		return true;
	}
	
}
