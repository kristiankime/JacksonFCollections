package com.artclod.common.collect.base;

import java.io.IOException;

import com.artclod.common.collect.ArrayFList;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;

@SuppressWarnings("rawtypes")
public class ArrayFListSerializer extends ContainerSerializer<ArrayFList>  {
//extends JsonSerializer<ArrayFList<?>>  {
	
	public ArrayFListSerializer() {
		super(ArrayFList.class);
	}

	private static final long serialVersionUID = 1L;

	@Override
	public void serialize(ArrayFList value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
//		gen.writeFieldName(CollectionWrapperDeserializer.VALUE);
		gen.writeObject(value.inner);
		
		
//		gen.writeO
		
//		serializers.serialize(value, gen, serializers);
		
		
//		CollectionType type = TypeFactory.defaultInstance().constructCollectionType(handledType(), elementType);
//		TypeSerializer typeSerializer = serializers.findTypeSerializer(type);
//		typeSerializer.
//		gen.w
	}
	
	@Override
	public Class<ArrayFList> handledType() {
		return ArrayFList.class;
	}
	
	@Override
	public void serializeWithType(ArrayFList value, JsonGenerator gen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonProcessingException {
	  typeSer.writeTypePrefixForObject(value, gen);
	  serialize(value, gen, provider); // call your customized serialize method
	  typeSer.writeTypeSuffixForObject(value, gen);
	}

	@Override
	public JavaType getContentType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JsonSerializer<?> getContentSerializer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasSingleElement(ArrayFList value) {
		return value.size() == 1;
	}

	@Override
	protected ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer vts) {
		// TODO Auto-generated method stub
		return null;
	}
	
}