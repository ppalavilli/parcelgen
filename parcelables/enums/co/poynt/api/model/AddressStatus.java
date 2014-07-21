
package co.poynt.api.model;

public enum AddressStatus {
    // @formatter:off
    ADDED("A");
    // CONFIRMED("C"), -> not planning on implementing now
    // REMOVED("R"); -> not planning on exposing removed 
    // @formatter:on

    private String status;

    AddressStatus(String status) {
        this.status = status;
    }

    public String status() {
        return this.status;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static AddressStatus findByStatus(String status) {
        for (AddressStatus v : values()) {
            if (v.status().equals(status)) {
                return v;
            }
        }
        return null;
    }
}
