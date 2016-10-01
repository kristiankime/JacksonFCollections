package com.artclod.common.collect.support;

import java.util.LinkedList;

import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonCollectionContains;

public class LinkedListContains extends JsonCollectionContains<LinkedList<ContainedInteger>, ContainedInteger> {
	public LinkedListContains() {
		super();
	}
	public LinkedListContains(LinkedList<ContainedInteger> collection) {
		super(collection);
	}
}