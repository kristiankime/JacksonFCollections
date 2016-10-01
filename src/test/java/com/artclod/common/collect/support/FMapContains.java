package com.artclod.common.collect.support;

import com.artclod.common.collect.FMap;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.ContainedString;
import com.artclod.common.collect.util.JsonMapContains;

public class FMapContains extends JsonMapContains<FMap<ContainedInteger, ContainedString>, ContainedInteger, ContainedString> {
	public FMapContains() {
		super();
	}
	public FMapContains(FMap<ContainedInteger, ContainedString> collection) {
		super(collection);
	}
}