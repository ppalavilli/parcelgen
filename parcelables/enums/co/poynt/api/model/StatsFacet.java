package co.poynt.api.model;

public enum StatsFacet {
    CUSTOMERS("CUSTOMERS"), SALES("SALES"), ORDERS("ORDERS"), ACTIVITY("ACTIVITY"), REACH("REACH"), SENTIMENT("SENTIMENT");

    private String statsFacet;

    StatsFacet(String statsFacet) {
        this.statsFacet = statsFacet;
    }

    public String statsFacet() {
        return this.statsFacet;
    }

    public static StatsFacet findByStatsFacet(String statsFacet) {
        for (StatsFacet v : values()) {
            if (v.statsFacet().equals(statsFacet)) {
                return v;
            }
        }
        return null;
    }
}
