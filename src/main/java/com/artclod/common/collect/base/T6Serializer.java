package com.artclod.common.collect.base;

import java.io.IOException;

import com.artclod.common.base.T6;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class T6Serializer<A, B, C, D, E, F> extends StdSerializer<T6<A, B, C, D, E, F>> {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public T6Serializer() {
        super((Class) T6.class);
    }
	
	@Override
	public void serialize(T6<A, B, C, D, E, F> value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
        jgen.writeStartObject();
        jgen.writeObjectField("_1", value._1);
        jgen.writeObjectField("_2", value._2);
        jgen.writeObjectField("_3", value._3);
        jgen.writeObjectField("_4", value._4);
        jgen.writeObjectField("_5", value._5);
        jgen.writeObjectField("_6", value._6);
        jgen.writeEndObject();
	}

}
