package com.artclod.common.collect.support;

import com.artclod.common.collect.LinkedHashFMap;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.ContainedString;
import com.artclod.common.collect.util.JsonMapContains;

public class LinkedHashFMapContains extends JsonMapContains<LinkedHashFMap<ContainedInteger, ContainedString>, ContainedInteger, ContainedString> {
	public LinkedHashFMapContains() {
		super();
	}
	public LinkedHashFMapContains(LinkedHashFMap<ContainedInteger, ContainedString> collection) {
		super(collection);
	}
}