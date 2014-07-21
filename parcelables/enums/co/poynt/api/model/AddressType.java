
package co.poynt.api.model;

public enum AddressType {
    HOME("H"), WORK("W"), BUSINESS("B"), OTHER("O");

    private String type;

    AddressType(String type) {
        this.type = type;
    }

    public String type() {
        return this.type;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static AddressType findByType(String type) {
        for (AddressType v : values()) {
            if (v.type().equals(type)) {
                return v;
            }
        }
        return null;
    }
}
