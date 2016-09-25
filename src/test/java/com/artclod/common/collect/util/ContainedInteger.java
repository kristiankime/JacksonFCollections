package com.artclod.common.collect.util;

import java.io.Serializable;

public class ContainedInteger implements Contained<Integer>, Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer value;

	public ContainedInteger() {
		this(0);
	}
	
	public ContainedInteger(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ContainedInteger(" + value + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		ContainedInteger other = (ContainedInteger) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

}