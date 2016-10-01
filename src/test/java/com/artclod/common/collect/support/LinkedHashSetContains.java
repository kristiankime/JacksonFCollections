package com.artclod.common.collect.support;

import java.util.LinkedHashSet;

import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonCollectionContains;

public class LinkedHashSetContains extends JsonCollectionContains<LinkedHashSet<ContainedInteger>, ContainedInteger> {
	public LinkedHashSetContains() {
		super();
	}
	public LinkedHashSetContains(LinkedHashSet<ContainedInteger> collection) {
		super(collection);
	}
}