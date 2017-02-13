package com.artclod.common.collect.base;

import java.io.IOException;

import com.artclod.common.base.T5;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class T5Serializer<A, B, C, D, E> extends StdSerializer<T5<A, B, C, D, E>> {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public T5Serializer() {
        super((Class) T5.class);
    }
	
	@Override
	public void serialize(T5<A, B, C, D, E> value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
        jgen.writeStartObject();
        jgen.writeObjectField("_1", value._1);
        jgen.writeObjectField("_2", value._2);
        jgen.writeObjectField("_3", value._3);
        jgen.writeObjectField("_4", value._4);
        jgen.writeObjectField("_5", value._5);
        jgen.writeEndObject();
	}

}
