package com.artclod.common.collect.support;

import java.util.ArrayList;

import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonContains;

public class ArrayListContains extends JsonContains<ArrayList<ContainedInteger>, ContainedInteger> {
	public ArrayListContains() {
		super();
	}
	public ArrayListContains(ArrayList<ContainedInteger> collection) {
		super(collection);
	}
}