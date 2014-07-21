
package co.poynt.api.model;

public enum StoreDeviceType {

    // @formatter:off
    TERMINAL("T"),
    WIFI_SENSOR("W");
    // @formatter:on

    private String type;

    StoreDeviceType(String type) {
        this.type = type;
    }

    public String type() {
        return this.type;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static StoreDeviceType findByType(String type) {
        for (StoreDeviceType v : values()) {
            if (v.type().equals(type)) {
                return v;
            }
        }
        return null;
    }
}
