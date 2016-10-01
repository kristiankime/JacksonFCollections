package com.artclod.common.collect.support;

import com.artclod.common.collect.FList;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonCollectionContains;

public class FListContains extends JsonCollectionContains<FList<ContainedInteger>, ContainedInteger> {
	public FListContains() {
		super();
	}
	public FListContains(FList<ContainedInteger> collection) {
		super(collection);
	}
}