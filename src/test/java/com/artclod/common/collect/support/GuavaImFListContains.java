package com.artclod.common.collect.support;

import com.artclod.common.collect.GuavaImFList;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonCollectionContains;

public class GuavaImFListContains extends JsonCollectionContains<GuavaImFList<ContainedInteger>, ContainedInteger> {
	public GuavaImFListContains() {
		super();
	}
	public GuavaImFListContains(GuavaImFList<ContainedInteger> collection) {
		super(collection);
	}
}