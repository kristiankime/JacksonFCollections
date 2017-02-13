package com.artclod.common.collect.base;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonFormat(shape=JsonFormat.Shape.OBJECT) // This will only work with Jackson 2.9 and higher https://github.com/FasterXML/jackson-databind/issues/865
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, isGetterVisibility = JsonAutoDetect.Visibility.NONE, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE, creatorVisibility = JsonAutoDetect.Visibility.NONE)
public abstract class T7MixIn<A, B, C, D, E, F, G> {
	T7MixIn(@JsonProperty("_1") A _1, @JsonProperty("_2") B _2, @JsonProperty("_3") C _3, @JsonProperty("_4") D _4, @JsonProperty("_5") E _5, @JsonProperty("_6") F _6, @JsonProperty("_7") G _7) { }
}
