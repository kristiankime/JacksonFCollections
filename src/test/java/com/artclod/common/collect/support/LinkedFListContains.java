package com.artclod.common.collect.support;

import com.artclod.common.collect.LinkedFList;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonContains;

public class LinkedFListContains extends JsonContains<LinkedFList<ContainedInteger>, ContainedInteger> {
	public LinkedFListContains() {
		super();
	}
	public LinkedFListContains(LinkedFList<ContainedInteger> collection) {
		super(collection);
	}
}