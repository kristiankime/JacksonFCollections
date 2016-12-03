package com.artclod.common.collect.base;

import java.io.IOException;

import com.artclod.common.base.T2;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class T2Deserializer<A, B> extends StdSerializer<T2<A, B>> {
	private static final long serialVersionUID = 1L;

	public T2Deserializer() {
        this(null);
    }
   
    public T2Deserializer(Class<T2<A, B>> t) {
        super(t);
    }
	
	@Override
	public void serialize(T2<A, B> value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
        jgen.writeStartObject();
        jgen.writeObjectField("_1", value._1);
        jgen.writeObjectField("_2", value._2);
        jgen.writeEndObject();
	}

}
