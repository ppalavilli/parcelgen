
package co.poynt.api.model;

public enum TerritoryType {
    STATE("S"), PROVINCE("P"), OTHER("O");

    private String type;

    TerritoryType(String type) {
        this.type = type;
    }

    public String type() {
        return this.type;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static TerritoryType findByType(String type) {
        for (TerritoryType v : values()) {
            if (v.type().equals(type)) {
                return v;
            }
        }
        return null;
    }
}
