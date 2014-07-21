
package co.poynt.api.model;

public enum CredentialType {
    USERNAME("U"), EMAIL("E"), PHONE("P"), FINGERPRINT("F"), JWT("J");

    private String type;

    CredentialType(String type) {
        this.type = type;
    }

    public String type() {
        return this.type;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static CredentialType findByType(String type) {
        for (CredentialType v : values()) {
            if (v.type().equals(type)) {
                return v;
            }
        }
        return null;
    }
}
