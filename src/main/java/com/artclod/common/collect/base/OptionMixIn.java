package com.artclod.common.collect.base;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

@JsonTypeInfo(use = JsonTypeInfo.Id.MINIMAL_CLASS, include = As.PROPERTY, property = "@class")
public abstract class OptionMixIn { }
