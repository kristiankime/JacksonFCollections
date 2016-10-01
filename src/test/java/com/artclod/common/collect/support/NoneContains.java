package com.artclod.common.collect.support;

import com.artclod.common.collect.base.None;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonCollectionContains;

public class NoneContains extends JsonCollectionContains<None<ContainedInteger>, ContainedInteger> {
	public NoneContains() {
		super();
	}
	public NoneContains(None<ContainedInteger> option) {
		super(option);
	}
}