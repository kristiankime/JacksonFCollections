package com.artclod.common.collect.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.artclod.common.base.T7;
import com.artclod.common.collect.Json;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class T7Test  {

	public ObjectMapper objectMapper() {
		return Json.objectMapper();
	}

	@Test
	public void test_simple_objects() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	T7<Integer, String, Double, Integer, Integer, Integer, Integer> object = new T7<>(1, "test", 5.6, 4, 5, 6, 7);
    	String serialized = objectMapper.writeValueAsString(object);
    	T7<?, ?, ?, ?, ?, ?, ?> deserialized = objectMapper.readValue(serialized, T7.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_nested_objects() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	T7<Foo, String, Double, Integer, Integer, Integer, Integer> object = new T7<>(new Foo(1, 2), "test", 5.6, 4, 5, 6, 7);
    	String serialized = objectMapper.writeValueAsString(object);
    	T7<Foo, String, Double, Integer, Integer, Integer, Integer> deserialized = objectMapper.readValue(serialized, TypeFactory.defaultInstance().constructParametricType(T7.class, Foo.class, String.class, Double.class, Integer.class, Integer.class, Integer.class, Integer.class));
        assertEquals(object, deserialized);
	}
	
	@SuppressWarnings("unused")
	private static class Foo  {
		int a;
		int b;
		
		public Foo() {
			this(0, 0);
		}

		public Foo(int a, int b) {
			this.a = a;
			this.b = b;
		}

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + a;
			result = prime * result + b;
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
			Foo other = (Foo) obj;
			if (a != other.a)
				return false;
			if (b != other.b)
				return false;
			return true;
		}
	}
}
