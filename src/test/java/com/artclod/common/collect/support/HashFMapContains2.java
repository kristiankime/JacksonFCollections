package com.artclod.common.collect.support;

import com.artclod.common.collect.HashFMap;
import com.artclod.common.collect.util.ContainedString;
import com.artclod.common.collect.util.JsonMapContains;

public class HashFMapContains2 extends JsonMapContains<HashFMap<String, ContainedString>, String, ContainedString> {
	public HashFMapContains2() {
		super();
	}
	public HashFMapContains2(HashFMap<String, ContainedString> collection) {
		super(collection);
	}
}