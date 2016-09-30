package com.artclod.common.collect.support;

import com.artclod.common.collect.GuavaImFSet;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonContains;

public class GuavaImFSetContains extends JsonContains<GuavaImFSet<ContainedInteger>, ContainedInteger> {
	public GuavaImFSetContains() {
		super();
	}
	public GuavaImFSetContains(GuavaImFSet<ContainedInteger> collection) {
		super(collection);
	}
}