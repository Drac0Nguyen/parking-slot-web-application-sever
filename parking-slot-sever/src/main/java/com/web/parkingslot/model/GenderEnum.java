package com.web.parkingslot.model;

public enum GenderEnum {
    FEMALE("female"), MALE("male");

    private String name;

    GenderEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static GenderEnum fromString(String value) {
        if (value != null) {
            for (GenderEnum gender : GenderEnum.values()) {
                if (value.equalsIgnoreCase(gender.getName())) {
                    return gender;
                }
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in enum GenderEnum");
    }
}
