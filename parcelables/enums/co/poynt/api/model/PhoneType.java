
package co.poynt.api.model;

public enum PhoneType {
    HOME("H"), WORK("W"), BUSINESS("B"), MOBILE("M"), FAX("F"), PAGER("P"), OTHER("O");

    private String type;

    PhoneType(String type) {
        this.type = type;
    }

    public String type() {
        return this.type;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static PhoneType findByType(String type) {
        for (PhoneType v : values()) {
            if (v.type().equals(type)) {
                return v;
            }
        }
        return null;
    }
}
