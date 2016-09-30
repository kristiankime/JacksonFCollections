package com.artclod.common.collect.support;

import com.artclod.common.collect.GuavaImFList;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonContains;

public class GuavaImFListContains extends JsonContains<GuavaImFList<ContainedInteger>, ContainedInteger> {
	public GuavaImFListContains() {
		super();
	}
	public GuavaImFListContains(GuavaImFList<ContainedInteger> collection) {
		super(collection);
	}
}