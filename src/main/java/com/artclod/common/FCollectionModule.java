package com.artclod.common;

import com.artclod.common.collect.ArrayFList;
import com.artclod.common.collect.base.ArrayFListDeserializer;
import com.artclod.common.collect.base.ArrayFListSerializer;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.module.SimpleDeserializers;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.module.SimpleSerializers;


public class FCollectionModule extends SimpleModule {
	private static final long serialVersionUID = 1L;

	public FCollectionModule() {
		super("FCollectionModule", new Version(0, 0, 1, null, "com.github.kristiankime", "jackson-datatype-functional-collections"));
	}

	// =============== Simple De/Serializers =============== 
	@Override
	public void setupModule(SetupContext context) {
		SimpleSerializers serializers = serializers();
		context.addSerializers(serializers);
		
		SimpleDeserializers deserializers = deserializers();
		context.addDeserializers(deserializers);
	}

	private SimpleDeserializers deserializers() {
		SimpleDeserializers deserializers = new SimpleDeserializers();
		deserializers.addDeserializer(ArrayFList.class, new ArrayFListDeserializer());
		return deserializers;
	}

	private SimpleSerializers serializers() {
		SimpleSerializers serializers = new SimpleSerializers();
		serializers.addSerializer(new ArrayFListSerializer());
		return serializers;
	}
	
	// =============== Custom De/Serializers =============== 
//	@Override
//	public void setupModule(SetupContext context) {
//		FCollectionSerializers serializers = new FCollectionSerializers();
//		context.addSerializers(serializers);
//	}

	// =============== Mixin Style =============== 
//	@Override
//	public void setupModule(SetupContext context) {
//		context.setMixInAnnotations(ArrayFList.class, ArrayFListMixIn.class);
//	}
//	
//	public static abstract class ArrayFListMixIn {
//		ArrayFListMixIn(@JsonProperty("inner") ArrayList<?> inner) {}
//	}
	
}
