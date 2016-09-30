package com.artclod.common.collect.support;

import java.util.LinkedList;

import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonContains;

public class LinkedListContains extends JsonContains<LinkedList<ContainedInteger>, ContainedInteger> {
	public LinkedListContains() {
		super();
	}
	public LinkedListContains(LinkedList<ContainedInteger> collection) {
		super(collection);
	}
}