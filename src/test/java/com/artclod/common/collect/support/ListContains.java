package com.artclod.common.collect.support;

import java.util.List;

import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonCollectionContains;

public class ListContains extends JsonCollectionContains<List<ContainedInteger>, ContainedInteger> {
	public ListContains() {
		super();
	}
	public ListContains(List<ContainedInteger> collection) {
		super(collection);
	}
}