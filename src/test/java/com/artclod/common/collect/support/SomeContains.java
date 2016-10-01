package com.artclod.common.collect.support;

import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonCollectionContains;

public class SomeContains extends JsonCollectionContains<com.artclod.common.collect.base.Some<ContainedInteger>, ContainedInteger> {
	public SomeContains() {
		super();
	}
	public SomeContains(com.artclod.common.collect.base.Some<ContainedInteger> option) {
		super(option);
	}
}