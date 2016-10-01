package com.artclod.common.collect.util;

import java.util.Map;

public abstract class JsonMapContains<M extends Map<K, V>, K, V> {
	private M collection = null;

	public JsonMapContains() {
		//
	}
	
	public JsonMapContains(M collection) {
		this.collection = collection;
	}

	public M getCollection() {
		return collection;
	}

	public void setCollection(M collection) {
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
		JsonMapContains<?, ?, ?> other = (JsonMapContains<?, ?, ?>) obj;
		if (collection == null) {
			if (other.collection != null)
				return false;
		} else if (!collection.equals(other.collection))
			return false;
		return true;
	}
	
}
