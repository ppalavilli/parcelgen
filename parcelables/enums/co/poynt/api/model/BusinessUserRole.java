
package co.poynt.api.model;

public enum BusinessUserRole {
    // @formatter:off
    OWNER("O"),
    EMPLOYEE("E");
    // @formatter:on

    private String role;

    BusinessUserRole(String role) {
        this.role = role;
    }

    public String role() {
        return this.role;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static BusinessUserRole findByRole(String role) {
        for (BusinessUserRole v : values()) {
            if (v.role().equals(role)) {
                return v;
            }
        }
        return null;
    }
}
