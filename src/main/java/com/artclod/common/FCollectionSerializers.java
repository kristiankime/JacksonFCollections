package com.artclod.common;

import com.artclod.common.collect.ArrayFList;
import com.artclod.common.collect.base.ArrayFListSerializer;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.type.ReferenceType;

public class FCollectionSerializers extends Serializers.Base {

    @Override
    public JsonSerializer<?> findReferenceSerializer(
    		SerializationConfig config, 
            ReferenceType refType, 
            BeanDescription beanDesc,
            TypeSerializer contentTypeSerializer, 
            JsonSerializer<Object> contentValueSerializer) {
        
    	final Class<?> raw = refType.getRawClass();
        if (ArrayFList.class.isAssignableFrom(raw)) {
            return new ArrayFListSerializer();
        }
        return null;
    }
	
}