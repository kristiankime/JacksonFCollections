package com.artclod.common.collect.support;

import com.artclod.common.collect.ArrayFList;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonContains;

public class ArrayFListContains extends JsonContains<ArrayFList<ContainedInteger>, ContainedInteger> {
	public ArrayFListContains() {
		super();
	}
	public ArrayFListContains(ArrayFList<ContainedInteger> collection) {
		super(collection);
	}
}