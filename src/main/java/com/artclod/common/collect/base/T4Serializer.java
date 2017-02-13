package com.artclod.common.collect.base;

import java.io.IOException;

import com.artclod.common.base.T4;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class T4Serializer<A, B, C, D> extends StdSerializer<T4<A, B, C, D>> {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public T4Serializer() {
        super((Class) T4.class);
    }
	
	@Override
	public void serialize(T4<A, B, C, D> value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
        jgen.writeStartObject();
        jgen.writeObjectField("_1", value._1);
        jgen.writeObjectField("_2", value._2);
        jgen.writeObjectField("_3", value._3);
        jgen.writeObjectField("_4", value._4);
        jgen.writeEndObject();
	}

}
