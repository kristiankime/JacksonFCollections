package com.artclod.common.collect.support;

import com.artclod.common.collect.LinkedHashFSet;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonContains;

public class LinkedHashFSetContains extends JsonContains<LinkedHashFSet<ContainedInteger>, ContainedInteger> {
	public LinkedHashFSetContains() {
		super();
	}
	public LinkedHashFSetContains(LinkedHashFSet<ContainedInteger> collection) {
		super(collection);
	}
}