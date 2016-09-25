package com.artclod.common.collect.util;

import java.io.Serializable;
import java.util.Collection;

import com.artclod.common.collect.ArrayFList;
import com.artclod.common.collect.FCollection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Contains implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private FCollection<? extends Contained<?>> thing;

	public Contains() {
		this(ArrayFList.create());
	}
	
	@JsonCreator
	public Contains(@JsonProperty("thing") FCollection<? extends Contained<?>> thing) {
		this.thing = thing;
	}

	public Collection<? extends Contained<?>> getThing() {
		return thing;
	}

	public void setThing(FCollection<? extends Contained<?>> list) {
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
		Contains other = (Contains) obj;
		if (thing == null) {
			if (other.thing != null)
				return false;
		} else if (!thing.equals(other.thing))
			return false;
		return true;
	}
}