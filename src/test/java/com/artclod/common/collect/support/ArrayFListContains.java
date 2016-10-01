package com.artclod.common.collect.support;

import com.artclod.common.collect.ArrayFList;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonCollectionContains;

public class ArrayFListContains extends JsonCollectionContains<ArrayFList<ContainedInteger>, ContainedInteger> {
	public ArrayFListContains() {
		super();
	}
	public ArrayFListContains(ArrayFList<ContainedInteger> collection) {
		super(collection);
	}
}