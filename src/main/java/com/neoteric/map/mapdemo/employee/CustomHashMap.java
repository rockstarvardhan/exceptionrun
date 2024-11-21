package com.neoteric.map.mapdemo.employee;

import java.util.Map;
import java.util.Set;

public abstract class CustomHashMap<I extends Number, E> {
    public abstract Set<Map.Entry<Integer, Employee>> entrySet();
}
