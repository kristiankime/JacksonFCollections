package com.artclod.common.collect.support;

import com.artclod.common.collect.FCollection;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.JsonCollectionContains;

public class FCollectionContains extends JsonCollectionContains<FCollection<ContainedInteger>, ContainedInteger> {
	public FCollectionContains() {
		super();
	}
	public FCollectionContains(FCollection<ContainedInteger> collection) {
		super(collection);
	}
}