package com.artclod.common.collect.base;

import java.io.IOException;

import com.artclod.common.base.T7;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class T7Serializer<A, B, C, D, E, F, G> extends StdSerializer<T7<A, B, C, D, E, F, G>> {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public T7Serializer() {
        super((Class) T7.class);
    }
	
	@Override
	public void serialize(T7<A, B, C, D, E, F, G> value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
        jgen.writeStartObject();
        jgen.writeObjectField("_1", value._1);
        jgen.writeObjectField("_2", value._2);
        jgen.writeObjectField("_3", value._3);
        jgen.writeObjectField("_4", value._4);
        jgen.writeObjectField("_5", value._5);
        jgen.writeObjectField("_6", value._6);
        jgen.writeObjectField("_7", value._7);
        jgen.writeEndObject();
	}

}
