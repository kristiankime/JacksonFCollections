package com.artclod.common.collect.support;

import java.util.HashSet;

import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonContains;

public class HashSetContains extends JsonContains<HashSet<ContainedInteger>, ContainedInteger> {
	public HashSetContains() {
		super();
	}
	public HashSetContains(HashSet<ContainedInteger> collection) {
		super(collection);
	}
}