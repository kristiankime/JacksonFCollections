package com.artclod.common.collect;

import static org.junit.Assert.*;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.artclod.common.json.SerializeDeserializeJsonContract;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ArrayFListTest extends SerializeDeserializeJsonContract<ArrayFList<String>> {

	public ObjectMapper objectMapper() {
		return Json.objectMapper();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Class<ArrayFList<String>> type() {
		return (Class) ArrayFList.class;
	}

	@Override
	public List<ArrayFList<String>> objects() {
		return Arrays.asList(ArrayFList.create(), ArrayFList.create("a", "b", "c"));
	}

	@Test
	public void test_json_with_nested_objects() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	Contains object = new Contains(ArrayFList.create(new ContainedIn("a")));
		String serialized = objectMapper.writeValueAsString(object);
		Contains deserialized = objectMapper.readValue(serialized, Contains.class);
        assertEquals(object, deserialized);
	}
	
	
	@SuppressWarnings("unused")
	private static class Contains implements Serializable {
		private static final long serialVersionUID = 1L;
		
		private ArrayFList<ContainedIn> thing;

		public Contains() {
			this(ArrayFList.create());
		}
		
		@JsonCreator
		public Contains(@JsonProperty("thing") ArrayFList<ContainedIn> thing) {
			this.thing = thing;
		}

		public FList<ContainedIn> getThing() {
			return thing;
		}

		public void setThing(ArrayFList<ContainedIn> list) {
			this.thing = list;
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

	@SuppressWarnings("unused")
	private static class ContainedIn implements Serializable {
		private static final long serialVersionUID = 1L;
		
		private String value;

		public ContainedIn() {
			this("");
		}
		
		public ContainedIn(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
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
			ContainedIn other = (ContainedIn) obj;
			if (value == null) {
				if (other.value != null)
					return false;
			} else if (!value.equals(other.value))
				return false;
			return true;
		}
	}

}
