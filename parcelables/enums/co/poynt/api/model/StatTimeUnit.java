package co.poynt.api.model;

public enum StatTimeUnit {
    HOURLY("HOURLY"), DAILY("DAILY"), WEEKLY("WEEKLY"), MONTHLY("MONTHLY"), YEARLY("YEARLY");

    private String timeUnit;

    StatTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    public String timeUnit() {
        return this.timeUnit;
    }

    public static StatTimeUnit findByTimeUnit(String timeUnit) {
        for (StatTimeUnit v : values()) {
            if (v.timeUnit().equals(timeUnit)) {
                return v;
            }
        }
        return null;
    }
}
