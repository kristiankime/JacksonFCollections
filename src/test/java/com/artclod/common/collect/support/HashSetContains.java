package com.artclod.common.collect.support;

import java.util.HashSet;

import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonCollectionContains;

public class HashSetContains extends JsonCollectionContains<HashSet<ContainedInteger>, ContainedInteger> {
	public HashSetContains() {
		super();
	}
	public HashSetContains(HashSet<ContainedInteger> collection) {
		super(collection);
	}
}