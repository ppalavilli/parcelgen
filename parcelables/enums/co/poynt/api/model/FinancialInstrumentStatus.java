
package co.poynt.api.model;

public enum FinancialInstrumentStatus {
    ACTIVE("A"), REMOVED("R");

    private String status;

    FinancialInstrumentStatus(String status) {
        this.status = status;
    }

    public String status() {
        return this.status;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static FinancialInstrumentStatus findByStatus(String status) {
        for (FinancialInstrumentStatus v : values()) {
            if (v.status().equals(status)) {
                return v;
            }
        }
        return null;
    }
}
