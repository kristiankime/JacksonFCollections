package com.artclod.common.collect;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

import org.junit.Test;

import com.artclod.common.collect.util.Contained;
import com.artclod.common.collect.util.ContainedInteger;
import com.artclod.common.collect.util.Contains;
import com.artclod.common.collect.util.ContainsArrayFList;
import com.artclod.common.collect.util.JsonContains;
import com.artclod.common.json.SerializeDeserializeCollectionJsonContract;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;

public class ArrayFListTest extends SerializeDeserializeCollectionJsonContract<ArrayFList<?>> {

	public ObjectMapper objectMapper() {
		ObjectMapper objectMapper = Json.objectMapper();
		
		
		
		return objectMapper;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Class<ArrayFList<?>> type() {
		return (Class) ArrayFList.class;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E> ArrayFList<?> create(E... elements) {
		return ArrayFList.create(elements);
	}
//
//	
//	@Test
//	public void json_roundtrip_with_nested_objects_string() throws Exception {
//    	ObjectMapper objectMapper = objectMapper();
//    	ContainsArrayFList object = new ContainsArrayFList(ArrayFList.create(new ContainedInteger(1)));
//		String serialized = objectMapper.writeValueAsString(object);
//		ContainsArrayFList deserialized = objectMapper.readValue(serialized, ContainsArrayFList.class);
//        assertEquals(object, deserialized);
//	}
//	
//	@Test
//	public void foo() throws Exception {
//    	ObjectMapper objectMapper = objectMapper();
//    	ArrayList<Contained<?>> object = Lists.newArrayList(new ContainedInteger(1));
//    	String serialized = objectMapper.writeValueAsString(object);
//    	ArrayList<?> deserialized = objectMapper.readValue(serialized, ArrayList.class);
//        assertEquals(object, deserialized);
//	}
//	
//	@Test
//	public void fooObject() throws Exception {
//    	ObjectMapper objectMapper = objectMapper();
//    	Foo object = new Foo(Lists.newArrayList(new ContainedInteger(1)));
//    	String serialized = objectMapper.writeValueAsString(object);
//    	Foo deserialized = objectMapper.readValue(serialized, Foo.class);
//        assertEquals(object, deserialized);
//	}
//
//
//	
//	public static class Foo {
//		ArrayList<Contained<?>> things;
//
//		public Foo() {
//		}
//		
//		public Foo(ArrayList<Contained<?>> things) {
//			this.things = things;
//		}
//
//		public ArrayList<Contained<?>> getThings() {
//			return things;
//		}
//
//		public void setThings(ArrayList<Contained<?>> things) {
//			this.things = things;
//		}
//
//		@Override
//		public int hashCode() {
//			final int prime = 31;
//			int result = 1;
//			result = prime * result + ((things == null) ? 0 : things.hashCode());
//			return result;
//		}
//
//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			Foo other = (Foo) obj;
//			if (things == null) {
//				if (other.things != null)
//					return false;
//			} else if (!things.equals(other.things))
//				return false;
//			return true;
//		}
//	}
//	
//
//	@Test
//	public void foo2() throws Exception {
//    	ObjectMapper objectMapper = objectMapper();
//    	Contained<Integer> object = new ContainedInteger(1);
//    	String serialized = objectMapper.writeValueAsString(object);
//    	Contained<?> deserialized = objectMapper.readValue(serialized, Contained.class);
//        assertEquals(object, deserialized);
//	}
//	
//	
//	
//	
//	
//	
//	
//	@Test
//	public void fooFObject() throws Exception {
//    	ObjectMapper objectMapper = objectMapper();
//    	FooF object = new FooF(ArrayFList.create(new ContainedInteger(1)));
//    	String serialized = objectMapper.writeValueAsString(object);
//    	FooF deserialized = objectMapper.readValue(serialized, FooF.class);
//        assertEquals(object, deserialized);
//	}
//	
//	public static class FooF {
//		ArrayFList<Contained<?>> things;
//
//		public FooF() {
//		}
//		
//		public FooF(ArrayFList<Contained<?>> things) {
//			this.things = things;
//		}
//
//		public ArrayFList<Contained<?>> getThings() {
//			return things;
//		}
//
//		public void setThings(ArrayFList<Contained<?>> things) {
//			this.things = things;
//		}
//
//		@Override
//		public int hashCode() {
//			final int prime = 31;
//			int result = 1;
//			result = prime * result + ((things == null) ? 0 : things.hashCode());
//			return result;
//		}
//
//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			FooF other = (FooF) obj;
//			if (things == null) {
//				if (other.things != null)
//					return false;
//			} else if (!things.equals(other.things))
//				return false;
//			return true;
//		}
//	}
//	
//	
//	@Test
//	public void fooLObject() throws Exception {
//    	ObjectMapper objectMapper = objectMapper();
//    	FooL object = new FooL(Lists.newLinkedList(Arrays.asList(new ContainedInteger(1))));
//    	String serialized = objectMapper.writeValueAsString(object);
//    	FooL deserialized = objectMapper.readValue(serialized, FooL.class);
//        assertEquals(object, deserialized);
//	}
//	
//	public static class FooL {
//		LinkedList<Contained<?>> things;
//
//		public FooL() {
//		}
//		
//		public FooL(LinkedList<Contained<?>> things) {
//			this.things = things;
//		}
//
//		public LinkedList<Contained<?>> getThings() {
//			return things;
//		}
//
//		public void setThings(LinkedList<Contained<?>> things) {
//			this.things = things;
//		}
//
//		@Override
//		public int hashCode() {
//			final int prime = 31;
//			int result = 1;
//			result = prime * result + ((things == null) ? 0 : things.hashCode());
//			return result;
//		}
//
//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			FooL other = (FooL) obj;
//			if (things == null) {
//				if (other.things != null)
//					return false;
//			} else if (!things.equals(other.things))
//				return false;
//			return true;
//		}
//	}
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void test_ArrayListContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	ArrayListContains object = new ArrayListContains(Lists.newArrayList(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	ArrayListContains deserialized = objectMapper.readValue(serialized, ArrayListContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_LinkedListContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	LinkedListContains object = new LinkedListContains(Lists.newLinkedList(Arrays.asList(new ContainedInteger(1))));
    	String serialized = objectMapper.writeValueAsString(object);
    	LinkedListContains deserialized = objectMapper.readValue(serialized, LinkedListContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_ArrayFListContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	ArrayFListContains object = new ArrayFListContains(ArrayFList.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	ArrayFListContains deserialized = objectMapper.readValue(serialized, ArrayFListContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_CollectionContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	CollectionContains object = new CollectionContains(ArrayFList.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	CollectionContains deserialized = objectMapper.readValue(serialized, CollectionContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_FCollectionContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	FCollectionContains object = new FCollectionContains(ArrayFList.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	FCollectionContains deserialized = objectMapper.readValue(serialized, FCollectionContains.class);
        assertEquals(object, deserialized);
	}
	
	@Test
	public void test_FListContains() throws Exception {
    	ObjectMapper objectMapper = objectMapper();
    	FListContains object = new FListContains(ArrayFList.create(new ContainedInteger(1)));
    	String serialized = objectMapper.writeValueAsString(object);
    	FListContains deserialized = objectMapper.readValue(serialized, FListContains.class);
        assertEquals(object, deserialized);
	}
	
	// =====
	@SuppressWarnings("unused")
	private static class ArrayListContains extends JsonContains<ArrayList<ContainedInteger>, ContainedInteger> {
		public ArrayListContains() {
			super();
		}
		public ArrayListContains(ArrayList<ContainedInteger> collection) {
			super(collection);
		}
	}
	
	@SuppressWarnings("unused")
	private static class LinkedListContains extends JsonContains<LinkedList<ContainedInteger>, ContainedInteger> {
		public LinkedListContains() {
			super();
		}
		public LinkedListContains(LinkedList<ContainedInteger> collection) {
			super(collection);
		}
	}
	
	@SuppressWarnings("unused")
	private static class ArrayFListContains extends JsonContains<ArrayFList<ContainedInteger>, ContainedInteger> {
		public ArrayFListContains() {
			super();
		}
		public ArrayFListContains(ArrayFList<ContainedInteger> collection) {
			super(collection);
		}
	}
	
	@SuppressWarnings("unused")
	private static class CollectionContains extends JsonContains<Collection<ContainedInteger>, ContainedInteger> {
		public CollectionContains() {
			super();
		}
		public CollectionContains(Collection<ContainedInteger> collection) {
			super(collection);
		}
	}
	
	@SuppressWarnings("unused")
	private static class FCollectionContains extends JsonContains<FCollection<ContainedInteger>, ContainedInteger> {
		public FCollectionContains() {
			super();
		}
		public FCollectionContains(FCollection<ContainedInteger> collection) {
			super(collection);
		}
	}
	
	@SuppressWarnings("unused")
	private static class FListContains extends JsonContains<FList<ContainedInteger>, ContainedInteger> {
		public FListContains() {
			super();
		}
		public FListContains(FList<ContainedInteger> collection) {
			super(collection);
		}
	}
	
}
