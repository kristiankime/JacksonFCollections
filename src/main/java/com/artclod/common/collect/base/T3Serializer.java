package com.artclod.common.collect.base;

import java.io.IOException;

import com.artclod.common.base.T3;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class T3Serializer<A, B, C> extends StdSerializer<T3<A, B, C>> {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public T3Serializer() {
        super((Class) T3.class);
    }
   
	
	@Override
	public void serialize(T3<A, B, C> value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
        jgen.writeStartObject();
        jgen.writeObjectField("_1", value._1);
        jgen.writeObjectField("_2", value._2);
        jgen.writeObjectField("_3", value._3);
        jgen.writeEndObject();
	}

}
