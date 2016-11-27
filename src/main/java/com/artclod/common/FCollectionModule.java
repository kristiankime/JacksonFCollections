	package com.artclod.common;

import com.artclod.common.collect.ArrayFList;
import com.artclod.common.collect.FCollection;
import com.artclod.common.collect.FList;
import com.artclod.common.collect.FMap;
import com.artclod.common.collect.FSet;
import com.artclod.common.collect.GuavaImFList;
import com.artclod.common.collect.GuavaImFListSerializer;
import com.artclod.common.collect.GuavaImFMap;
import com.artclod.common.collect.GuavaImFSet;
import com.artclod.common.collect.GuavaImFSetSerializer;
import com.artclod.common.collect.HashFMap;
import com.artclod.common.collect.HashFSet;
import com.artclod.common.collect.ImFCollection;
import com.artclod.common.collect.ImFList;
import com.artclod.common.collect.ImFMap;
import com.artclod.common.collect.ImFSet;
import com.artclod.common.collect.LinkedFList;
import com.artclod.common.collect.LinkedHashFMap;
import com.artclod.common.collect.LinkedHashFSet;
import com.artclod.common.collect.base.ArrayFListDeserializer;
import com.artclod.common.collect.base.ArrayFListSerializer;
import com.artclod.common.collect.base.GuavaImFListDeserializer;
import com.artclod.common.collect.base.GuavaImFMapDeserializer;
import com.artclod.common.collect.base.GuavaImFSetDeserializer;
import com.artclod.common.collect.base.HashFMapDeserializer;
import com.artclod.common.collect.base.HashFSetDeserializer;
import com.artclod.common.collect.base.LinkedFListDeserializer;
import com.artclod.common.collect.base.LinkedFListSerializer;
import com.artclod.common.collect.base.LinkedHashFMapDeserializer;
import com.artclod.common.collect.base.LinkedHashFSetDeserializer;
import com.artclod.common.collect.base.NoneDeserializer;
import com.artclod.common.collect.base.Option;
import com.artclod.common.collect.base.OptionDeserializer;
import com.artclod.common.collect.base.Some;
import com.artclod.common.collect.base.SomeDeserializer;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.module.SimpleDeserializers;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.module.SimpleSerializers;

public class FCollectionModule extends SimpleModule {
	private static final long serialVersionUID = 1L;

	public FCollectionModule() {
		super("FCollectionModule", new Version(0, 0, 10, "-1", "com.github.kristiankime", "jackson-datatype-functional-collections"));
	}

	// =============== Simple De/Serializers =============== 
	@Override
	public void setupModule(SetupContext context) {
		super.setupModule(context);
		
		// Serializers
//		context.addSerializers(serializers()); Currently use default serializers 
		// Option will be serialized as a Collection (this means empty array == None, array with one element == Some)
//		context.setMixInAnnotations(Option.class, OptionMixIn.class);
		
		// Deserializers
		context.addDeserializers(deserializers());
		
		// Resolvers
		context.addAbstractTypeResolver(resolvers());	
	}

	private SimpleAbstractTypeResolver resolvers() {
		SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
		resolver.addMapping(FCollection.class, ArrayFList.class);
		resolver.addMapping(FList.class, ArrayFList.class);
		resolver.addMapping(ImFCollection.class, GuavaImFList.class);
		resolver.addMapping(ImFList.class, GuavaImFList.class);
		resolver.addMapping(FSet.class, LinkedHashFSet.class);
		resolver.addMapping(ImFSet.class, GuavaImFSet.class);
		resolver.addMapping(FMap.class, LinkedHashFMap.class);
		resolver.addMapping(ImFMap.class, GuavaImFMap.class);
		return resolver;
	}

	private SimpleDeserializers deserializers() {
		SimpleDeserializers deserializers = new SimpleDeserializers();
		deserializers.addDeserializer(ArrayFList.class, new ArrayFListDeserializer());
		deserializers.addDeserializer(LinkedFList.class, new LinkedFListDeserializer());
		deserializers.addDeserializer(GuavaImFList.class, new GuavaImFListDeserializer());
		
		deserializers.addDeserializer(LinkedHashFSet.class, new LinkedHashFSetDeserializer());
		deserializers.addDeserializer(HashFSet.class, new HashFSetDeserializer());
		deserializers.addDeserializer(GuavaImFSet.class, new GuavaImFSetDeserializer());
		
		deserializers.addDeserializer(HashFMap.class, new HashFMapDeserializer());
		deserializers.addDeserializer(LinkedHashFMap.class, new LinkedHashFMapDeserializer());
		deserializers.addDeserializer(GuavaImFMap.class, new GuavaImFMapDeserializer());
		
		deserializers.addDeserializer(Some.class, new SomeDeserializer());
		deserializers.addDeserializer(com.artclod.common.collect.base.None.class, new NoneDeserializer());
		deserializers.addDeserializer(Option.class, new OptionDeserializer());
		return deserializers;
	}

	/**
	 * Currently we use the default serializers for Collections/Maps
	 */
	@SuppressWarnings("unused")
	private SimpleSerializers serializers() {
		SimpleSerializers serializers = new SimpleSerializers();
		serializers.addSerializer(new ArrayFListSerializer());
		serializers.addSerializer(new LinkedFListSerializer());
		serializers.addSerializer(new GuavaImFListSerializer());
		serializers.addSerializer(new GuavaImFSetSerializer());
//		serializers.addSerializer(SomeSerializer.type(), new SomeSerializer());
//		serializers.addSerializer(NoneSerializer.type(), new NoneSerializer());
		return serializers;
	}
	
}
