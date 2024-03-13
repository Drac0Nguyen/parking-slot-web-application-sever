package com.web.parkingslot.model;

public enum RoleEnum {
    ROLE_USER("user"), ROLE_STAFF("staff"), ROLE_ADMIN("admin");

    private String name;

    RoleEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static RoleEnum fromString(String value) {
        if (value != null) {
            for (RoleEnum role : RoleEnum.values()) {
                if (value.equalsIgnoreCase(role.getName())) {
                    return role;
                }
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in enum RoleEnum");
    }
}
