
package co.poynt.api.model;

public enum NetworkInterfaceType {

    BLUETOOTH("B"),
    WIFI("W");

    private String type;

    NetworkInterfaceType(String type) {
        this.type = type;
    }

    public String type() {
        return this.type;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static NetworkInterfaceType findByType(String type) {
        for (NetworkInterfaceType v : values()) {
            if (v.type().equals(type)) {
                return v;
            }
        }
        return null;
    }
}
