package com.artclod.common.collect.support;

import com.artclod.common.collect.LinkedFList;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonCollectionContains;

public class LinkedFListContains extends JsonCollectionContains<LinkedFList<ContainedInteger>, ContainedInteger> {
	public LinkedFListContains() {
		super();
	}
	public LinkedFListContains(LinkedFList<ContainedInteger> collection) {
		super(collection);
	}
}