
package co.poynt.api.model;

public enum TokenType {
    BEARER("B");

    private String type;

    TokenType(String type) {
        this.type = type;
    }

    public String type() {
        return this.type;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static TokenType findByType(String type) {
        for (TokenType v : values()) {
            if (v.type().equals(type)) {
                return v;
            }
        }
        return null;
    }
}
