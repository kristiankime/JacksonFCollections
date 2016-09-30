package com.artclod.common.collect.support;

import com.artclod.common.collect.FSet;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonContains;

public class FSetContains extends JsonContains<FSet<ContainedInteger>, ContainedInteger> {
	public FSetContains() {
		super();
	}
	public FSetContains(FSet<ContainedInteger> collection) {
		super(collection);
	}
}