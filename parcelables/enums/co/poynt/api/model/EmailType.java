
package co.poynt.api.model;

public enum EmailType {
    PERSONAL("P"), WORK("W"), RECEIPT("R"), OTHER("O");

    private String type;

    EmailType(String type) {
        this.type = type;
    }

    public String type() {
        return this.type;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static EmailType findByType(String type) {
        for (EmailType v : values()) {
            if (v.type().equals(type)) {
                return v;
            }
        }
        return null;
    }
}
