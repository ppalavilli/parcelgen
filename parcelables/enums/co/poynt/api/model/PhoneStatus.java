
package co.poynt.api.model;

public enum PhoneStatus {
    // @formatter:off
    ADDED("A"),
    CONFIRMED("C");
    // REMOVED("R"); -> don't plan on exposing removed phones externally
    // @formatter:on

    private String status;

    PhoneStatus(String status) {
        this.status = status;
    }

    public String status() {
        return this.status;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static PhoneStatus findByStatus(String status) {
        for (PhoneStatus v : values()) {
            if (v.status().equals(status)) {
                return v;
            }
        }
        return null;
    }
}
