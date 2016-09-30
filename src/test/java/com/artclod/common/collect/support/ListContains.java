package com.artclod.common.collect.support;

import java.util.List;

import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonContains;

public class ListContains extends JsonContains<List<ContainedInteger>, ContainedInteger> {
	public ListContains() {
		super();
	}
	public ListContains(List<ContainedInteger> collection) {
		super(collection);
	}
}