	package com.artclod.common;

import com.artclod.common.base.T2;
import com.artclod.common.base.T3;
import com.artclod.common.collect.ArrayFList;
import com.artclod.common.collect.ArrayFListDeserializer;
import com.artclod.common.collect.FCollection;
import com.artclod.common.collect.FList;
import com.artclod.common.collect.FMap;
import com.artclod.common.collect.FSet;
import com.artclod.common.collect.GuavaImFList;
import com.artclod.common.collect.GuavaImFListDeserializer;
import com.artclod.common.collect.GuavaImFMap;
import com.artclod.common.collect.GuavaImFMapDeserializer;
import com.artclod.common.collect.GuavaImFSet;
import com.artclod.common.collect.GuavaImFSetDeserializer;
import com.artclod.common.collect.HashFMap;
import com.artclod.common.collect.HashFMapDeserializer;
import com.artclod.common.collect.HashFSet;
import com.artclod.common.collect.HashFSetDeserializer;
import com.artclod.common.collect.ImFCollection;
import com.artclod.common.collect.ImFList;
import com.artclod.common.collect.ImFMap;
import com.artclod.common.collect.ImFSet;
import com.artclod.common.collect.LinkedFList;
import com.artclod.common.collect.LinkedFListDeserializer;
import com.artclod.common.collect.LinkedHashFMap;
import com.artclod.common.collect.LinkedHashFMapDeserializer;
import com.artclod.common.collect.LinkedHashFSet;
import com.artclod.common.collect.LinkedHashFSetDeserializer;
import com.artclod.common.collect.base.Either;
import com.artclod.common.collect.base.EitherMixIn;
import com.artclod.common.collect.base.Left;
import com.artclod.common.collect.base.LeftMixIn;
import com.artclod.common.collect.base.NoneDeserializer;
import com.artclod.common.collect.base.Option;
import com.artclod.common.collect.base.OptionDeserializer;
import com.artclod.common.collect.base.Right;
import com.artclod.common.collect.base.RightMixIn;
import com.artclod.common.collect.base.Some;
import com.artclod.common.collect.base.SomeDeserializer;
import com.artclod.common.collect.base.T2MixIn;
import com.artclod.common.collect.base.T2Serializer;
import com.artclod.common.collect.base.T3MixIn;
import com.artclod.common.collect.base.T3Serializer;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.module.SimpleDeserializers;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.module.SimpleSerializers;

public class FCollectionModule extends SimpleModule {
	private static final long serialVersionUID = 1L;

	public FCollectionModule() {
		super("FCollectionModule", new Version(0, 0, 11, "-1", "com.github.kristiankime", "jackson-datatype-functional-collections"));
	}

	// =============== Simple De/Serializers =============== 
	@Override
	public void setupModule(SetupContext context) {
		super.setupModule(context);
		
		// Serializers
		context.addSerializers(serializers()); 
		
		context.setMixInAnnotations(T2.class, T2MixIn.class); // Note: this also has custom serializer (see javadoc)
		context.setMixInAnnotations(T3.class, T3MixIn.class); // Note: this also has custom serializer (see javadoc)
		
		context.setMixInAnnotations(Either.class, EitherMixIn.class);
		context.setMixInAnnotations(Left.class, LeftMixIn.class);
		context.setMixInAnnotations(Right.class, RightMixIn.class);
		
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

	@SuppressWarnings({ "unchecked", "rawtypes" })
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
	 * Options are serialized as a Collection (this means empty array == None, array with one element == Some)
	 */
	private SimpleSerializers serializers() {
		SimpleSerializers serializers = new SimpleSerializers();
//		serializers.addSerializer(new ArrayFListSerializer());
//		serializers.addSerializer(new LinkedFListSerializer());
//		serializers.addSerializer(new GuavaImFListSerializer());
//		serializers.addSerializer(new GuavaImFSetSerializer());
//		serializers.addSerializer(SomeSerializer.type(), new SomeSerializer());
//		serializers.addSerializer(NoneSerializer.type(), new NoneSerializer());
		serializers.addSerializer(new T2Serializer<>());
		serializers.addSerializer(new T3Serializer<>());
		return serializers;
	}
	
}
