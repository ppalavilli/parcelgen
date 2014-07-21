
package co.poynt.api.model;

public enum DeviceType {

    // @formatter:off
    MOBILE("M"),
    UNKNOWN("U");
    // @formatter:on

    private String type;

    DeviceType(String type) {
        this.type = type;
    }

    public String type() {
        return this.type;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static DeviceType findByType(String type) {
        for (DeviceType v : values()) {
            if (v.type().equals(type)) {
                return v;
            }
        }
        return null;
    }
}
