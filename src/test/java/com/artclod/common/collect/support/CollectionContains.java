package com.artclod.common.collect.support;

import java.util.Collection;

import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonContains;

public class CollectionContains extends JsonContains<Collection<ContainedInteger>, ContainedInteger> {
	public CollectionContains() {
		super();
	}
	public CollectionContains(Collection<ContainedInteger> collection) {
		super(collection);
	}
}