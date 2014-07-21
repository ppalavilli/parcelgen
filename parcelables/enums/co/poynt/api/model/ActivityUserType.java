
package co.poynt.api.model;

public enum ActivityUserType {
    ELITE("E"), UNKNOWN("U");

    private String type;

    ActivityUserType(String type) {
        this.type = type;
    }

    public String type() {
        return this.type;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static ActivityUserType findByType(String type) {
        for (ActivityUserType v : values()) {
            if (v.type().equals(type)) {
                return v;
            }
        }
        return null;
    }
}
