
package co.poynt.api.model;

public enum EmailStatus {
    // @formatter:off
    ADDED("A"),
    CONFIRMED("C");
    // REMOVED("R"); -> don't plan on exposing removed emails
    // @formatter:on

    private String status;

    EmailStatus(String status) {
        this.status = status;
    }

    public String status() {
        return this.status;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static EmailStatus findByStatus(String status) {
        for (EmailStatus v : values()) {
            if (v.status().equals(status)) {
                return v;
            }
        }
        return null;
    }
}
