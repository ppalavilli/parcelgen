
package co.poynt.api.model;

/**
 * Deprecated: use string equivalent values of PASSWORD or REFRESH_TOKEN
 *
 */
@Deprecated
public enum TokenGrantType {
	PASSWORD("P"), REFRESH_TOKEN("R");

    private String type;

    TokenGrantType(String type) {
        this.type = type;
    }

    public String type() {
        return this.type;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static TokenGrantType findByType(String type) {
        for (TokenGrantType v : values()) {
            if (v.type().equals(type)) {
                return v;
            }
        }
        return null;
    }
}
