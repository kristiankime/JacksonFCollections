package com.artclod.common.collect.support;

import java.util.Map;

import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.ContainedString;
import com.artclod.common.collect.util.JsonMapContains;

public class MapContains extends JsonMapContains<Map<ContainedInteger, ContainedString>, ContainedInteger, ContainedString> {
	public MapContains() {
		super();
	}
	public MapContains(Map<ContainedInteger, ContainedString> collection) {
		super(collection);
	}
}