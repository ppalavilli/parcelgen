
package co.poynt.api.model;

public enum FinancialInstrumentType {

    // @formatter:off
    CREDITDEBIT("R");
    // @formatter:on

    private String type;

    FinancialInstrumentType(String type) {
        this.type = type;
    }

    public String type() {
        return this.type;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static FinancialInstrumentType findByType(String type) {
        for (FinancialInstrumentType v : values()) {
            if (v.type().equals(type)) {
                return v;
            }
        }
        return null;
    }
}
