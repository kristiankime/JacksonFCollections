package com.artclod.common.collect.util;

import java.io.Serializable;
import java.util.Collection;

import com.artclod.common.collect.ArrayFList;
import com.artclod.common.collect.FCollection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

public class Contains implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonTypeInfo(use = JsonTypeInfo.Id.MINIMAL_CLASS, include = As.PROPERTY, property = "@class")
	private FCollection<Contained<?>> thing;

	public Contains() {
		this(ArrayFList.create());
	}
	
	@JsonCreator
	public Contains(@JsonProperty("thing") FCollection<Contained<?>> thing) {
		this.thing = thing;
	}

	public Collection<? extends Contained<?>> getThing() {
		return thing;
	}

	public void setThing(FCollection<Contained<?>> list) {
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