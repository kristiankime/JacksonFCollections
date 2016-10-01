package com.artclod.common.collect.support;

import java.util.Set;

import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonCollectionContains;

public class SetContains extends JsonCollectionContains<Set<ContainedInteger>, ContainedInteger> {
	public SetContains() {
		super();
	}
	public SetContains(Set<ContainedInteger> collection) {
		super(collection);
	}
}