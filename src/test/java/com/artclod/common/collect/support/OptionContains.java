package com.artclod.common.collect.support;

import com.artclod.common.collect.base.Option;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonCollectionContains;

public class OptionContains extends JsonCollectionContains<Option<ContainedInteger>, ContainedInteger> {
	public OptionContains() {
		super();
	}
	public OptionContains(Option<ContainedInteger> option) {
		super(option);
	}
}