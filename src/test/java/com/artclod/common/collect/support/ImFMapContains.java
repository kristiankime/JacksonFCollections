package com.artclod.common.collect.support;

import com.artclod.common.collect.ImFMap;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.ContainedString;
import com.artclod.common.collect.util.JsonMapContains;

public class ImFMapContains extends JsonMapContains<ImFMap<ContainedInteger, ContainedString>, ContainedInteger, ContainedString> {
	public ImFMapContains() {
		super();
	}
	public ImFMapContains(ImFMap<ContainedInteger, ContainedString> collection) {
		super(collection);
	}
}