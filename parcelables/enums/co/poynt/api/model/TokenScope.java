
package co.poynt.api.model;

public enum TokenScope {
    ALL("A");

    private String scope;

    TokenScope(String scope) {
        this.scope = scope;
    }

    public String scope() {
        return this.scope;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static TokenScope findByScope(String scope) {
        for (TokenScope v : values()) {
            if (v.scope().equals(scope)) {
                return v;
            }
        }
        return null;
    }
}
