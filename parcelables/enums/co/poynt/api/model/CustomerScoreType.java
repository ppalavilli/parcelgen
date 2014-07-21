
package co.poynt.api.model;

public enum CustomerScoreType {
    LOYALTY("L"), VALUE("V"), OVERALL("O");

    private String type;

    CustomerScoreType(String type) {
        this.type = type;
    }

    public String type() {
        return this.type;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static CustomerScoreType findByType(String type) {
        for (CustomerScoreType v : values()) {
            if (v.type().equals(type)) {
                return v;
            }
        }
        return null;
    }
}
