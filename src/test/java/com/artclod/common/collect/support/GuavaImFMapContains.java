package com.artclod.common.collect.support;

import com.artclod.common.collect.GuavaImFMap;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.ContainedString;
import com.artclod.common.collect.util.JsonMapContains;

public class GuavaImFMapContains extends JsonMapContains<GuavaImFMap<ContainedInteger, ContainedString>, ContainedInteger, ContainedString> {
	public GuavaImFMapContains() {
		super();
	}
	public GuavaImFMapContains(GuavaImFMap<ContainedInteger, ContainedString> collection) {
		super(collection);
	}
}