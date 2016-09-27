package com.artclod.common.collect.util;

import java.io.Serializable;

import com.artclod.common.collect.ArrayFList;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ContainsArrayFList implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private ArrayFList<Contained<?>> thing;

	public ContainsArrayFList() {
		this(ArrayFList.create());
	}
	
	@JsonCreator
	public ContainsArrayFList(@JsonProperty("thing") ArrayFList<Contained<?>> thing) {
		this.thing = thing;
	}

	public ArrayFList<Contained<?>> getThing() {
		return thing;
	}

	public void setThing(ArrayFList<Contained<?>> list) {
		this.thing = list;
	}

	@Override
	public String toString() {
		return "Contains(" + thing + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((thing == null) ? 0 : thing.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContainsArrayFList other = (ContainsArrayFList) obj;
		if (thing == null) {
			if (other.thing != null)
				return false;
		} else if (!thing.equals(other.thing))
			return false;
		return true;
	}
}