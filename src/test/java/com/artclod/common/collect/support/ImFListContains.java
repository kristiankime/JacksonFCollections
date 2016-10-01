package com.artclod.common.collect.support;

import com.artclod.common.collect.ImFList;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonCollectionContains;

public class ImFListContains extends JsonCollectionContains<ImFList<ContainedInteger>, ContainedInteger> {
	public ImFListContains() {
		super();
	}
	public ImFListContains(ImFList<ContainedInteger> collection) {
		super(collection);
	}
}