package com.artclod.common.collect.support;

import com.artclod.common.collect.HashFSet;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonCollectionContains;

public class HashFSetContains extends JsonCollectionContains<HashFSet<ContainedInteger>, ContainedInteger> {
	public HashFSetContains() {
		super();
	}
	public HashFSetContains(HashFSet<ContainedInteger> collection) {
		super(collection);
	}
}