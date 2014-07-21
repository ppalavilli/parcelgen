
package co.poynt.api.model;

public enum BusinessStatus {
    ADDED("A"), ACTIVATED("T"), LOCKED("L"), CLOSED("C");

    private String status;

    BusinessStatus(String status) {
        this.status = status;
    }

    public String status() {
        return this.status;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static BusinessStatus findByStatus(String status) {
        for (BusinessStatus v : values()) {
            if (v.status().equals(status)) {
                return v;
            }
        }
        return null;
    }
}
