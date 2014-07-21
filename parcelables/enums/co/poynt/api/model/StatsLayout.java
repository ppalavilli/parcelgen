package co.poynt.api.model;

public enum StatsLayout {
    PARTIAL("P"), SPLIT("S"), NUMBER_DELTA("N"),  NONE("NONE");

    private String layout;

    StatsLayout(String layout) {
        this.layout = layout;
    }

    public String layout() {
        return this.layout;
    }

    public static StatsLayout findByLayout(String layout) {
        for (StatsLayout v : values()) {
            if (v.layout().equals(layout)) {
                return v;
            }
        }
        return null;
    }
}
