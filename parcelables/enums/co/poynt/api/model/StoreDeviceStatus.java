
package co.poynt.api.model;

public enum StoreDeviceStatus {
    // @formatter:off
    CREATED("C"),
    ACTIVATED("A"),
    DEACTIVATED("D"),
    REMOVED("R");
    // @formatter:on

    private String status;

    StoreDeviceStatus(String status) {
        this.status = status;
    }

    public String status() {
        return this.status;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static StoreDeviceStatus findByStatus(String status) {
        for (StoreDeviceStatus v : values()) {
            if (v.status().equals(status)) {
                return v;
            }
        }
        return null;
    }
}
