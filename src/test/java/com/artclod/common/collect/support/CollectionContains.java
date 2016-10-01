package com.artclod.common.collect.support;

import java.util.Collection;

import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonCollectionContains;

public class CollectionContains extends JsonCollectionContains<Collection<ContainedInteger>, ContainedInteger> {
	public CollectionContains() {
		super();
	}
	public CollectionContains(Collection<ContainedInteger> collection) {
		super(collection);
	}
}