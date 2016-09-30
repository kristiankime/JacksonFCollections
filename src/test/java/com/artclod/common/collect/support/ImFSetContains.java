package com.artclod.common.collect.support;

import com.artclod.common.collect.ImFSet;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonContains;

public class ImFSetContains extends JsonContains<ImFSet<ContainedInteger>, ContainedInteger> {
	public ImFSetContains() {
		super();
	}
	public ImFSetContains(ImFSet<ContainedInteger> collection) {
		super(collection);
	}
}