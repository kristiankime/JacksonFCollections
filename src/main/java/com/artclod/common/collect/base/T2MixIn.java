package com.artclod.common.collect.base;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonTypeInfo(use = JsonTypeInfo.Id.MINIMAL_CLASS, include = As.PROPERTY, property = "@class")
@JsonFormat(shape=JsonFormat.Shape.OBJECT, without={}) // TODO this annotation seem to be ignore
//@JsonFormat(shape=JsonFormat.Shape.NUMBER)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, isGetterVisibility = JsonAutoDetect.Visibility.NONE, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE, creatorVisibility = JsonAutoDetect.Visibility.NONE)
//@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE,isGetterVisibility = JsonAutoDetect.Visibility.NONE, getterVisibility = JsonAutoDetect.Visibility.NONE, creatorVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public abstract class T2MixIn<A, B> {
	T2MixIn(@JsonProperty("_1") A _1, @JsonProperty("_2") B _2) { }
	
//	@JsonProperty A _1; 
//	@JsonProperty B _2; 
}
