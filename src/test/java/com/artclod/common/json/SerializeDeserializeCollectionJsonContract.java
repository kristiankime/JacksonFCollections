package com.artclod.common.json;

import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.junit.Test;

import com.artclod.jackson.databind.type.TypeFactories;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class SerializeDeserializeCollectionJsonContract<T extends Collection<?>> {

	public abstract Class<T> type();
		
	@SuppressWarnings("unchecked")
	public abstract <E> T create(E... elements);
	
	public abstract ObjectMapper objectMapper();
	
    @Test
    public void json_roundtrip_with_strings() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	T object = create("a", "b", "c");
    	String serialized = objectMapper.writeValueAsString(object);
		T deserialized = objectMapper.readValue(serialized, type());
        assertEquals(object, deserialized);
    }
    
    @Test
    public void json_roundtrip_with_integers() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	T object = create(1, 2, 3);
    	String serialized = objectMapper.writeValueAsString(object);
		T deserialized = objectMapper.readValue(serialized, type());
        assertEquals(object, deserialized);
    }
	
    @Test
    public void json_roundtrip_with_objects() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	T object = create(foo("a", "b"), foo("c", "d"), foo("e", "f"));
    	String serialized = objectMapper.writeValueAsString(object);
		T deserialized = objectMapper.readValue(serialized, TypeFactories.simpleCollectionType(type(), Foo.class));
        assertEquals(object, deserialized);
    }
    
    private static Foo foo(String bar, String baz) {
    	return new Foo(bar, baz);
    }
    
	@SuppressWarnings("unused")
    private static class Foo {
    	private String bar;
    	private String baz;
    	
    	public Foo() {
			this.bar = null;
			this.baz = null;
    	}
    	
		public Foo(String bar, String baz) {
			this.bar = bar;
			this.baz = baz;
		}
		
		public String getBar() {
			return bar;
		}

		public void setBar(String bar) {
			this.bar = bar;
		}

		public String getBaz() {
			return baz;
		}

		public void setBaz(String baz) {
			this.baz = baz;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((bar == null) ? 0 : bar.hashCode());
			result = prime * result + ((baz == null) ? 0 : baz.hashCode());
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
			if (bar == null) {
				if (other.bar != null)
					return false;
			} else if (!bar.equals(other.bar))
				return false;
			if (baz == null) {
				if (other.baz != null)
					return false;
			} else if (!baz.equals(other.baz))
				return false;
			return true;
		}
    }
    
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	@Test
//	public void json_roundtrip_with_nested_objects_integers() throws Exception {
//    	ObjectMapper objectMapper = objectMapper();
//		Contains object = new Contains((FCollection) create(new ContainedString("a")));
//		String serialized = objectMapper.writeValueAsString(object);
//		Contains deserialized = objectMapper.readValue(serialized, Contains.class);
//        assertEquals(object, deserialized);
//	}
//	
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	@Test
//	public void json_roundtrip_with_nested_objects_string() throws Exception {
//    	ObjectMapper objectMapper = objectMapper();
//		Contains object = new Contains((FCollection) create(new ContainedInteger(1)));
//		String serialized = objectMapper.writeValueAsString(object);
//		Contains deserialized = objectMapper.readValue(serialized, Contains.class);
//        assertEquals(object, deserialized);
//	}
    
}
