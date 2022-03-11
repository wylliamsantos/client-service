package com.wvs.clientservice.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

@AllArgsConstructor
@Getter
public enum GenderType {

    MALE("Male", "M"),
    FEMALE("Female", "F"),
    NONE("None", "N");


    private static final Map<String, GenderType> ENUM_MAP;
    private String description;
    private String initial;

    static {
        Map<String, GenderType> map = new ConcurrentHashMap<>();
        for (GenderType value : GenderType.values()) {
            map.put(value.getInitial(), value);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }

    public static GenderType get(String value) {
        final GenderType gender = ENUM_MAP.get(value);
        if (Objects.nonNull(gender)){
            return gender;
        }
        return null;
    }
}
