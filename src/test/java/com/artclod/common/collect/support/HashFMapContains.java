package com.artclod.common.collect.support;

import com.artclod.common.collect.HashFMap;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.ContainedString;
import com.artclod.common.collect.util.JsonMapContains;

public class HashFMapContains extends JsonMapContains<HashFMap<ContainedInteger, ContainedString>, ContainedInteger, ContainedString> {
	public HashFMapContains() {
		super();
	}
	public HashFMapContains(HashFMap<ContainedInteger, ContainedString> collection) {
		super(collection);
	}
}