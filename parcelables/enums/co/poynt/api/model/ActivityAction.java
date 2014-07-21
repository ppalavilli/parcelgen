
package co.poynt.api.model;

public enum ActivityAction {
	
	// @formatter:off
    CHECKIN("C"),
    DISLIKE("D"),
    ENTER("E"),
    LIKE("L"),
    COMMENT("O"),
    POST("P"),
    REVIEW("R"),    
    TWEET("T"),
    EXIT("X");
    // @formatter:on

    private String action;

    ActivityAction(String action) {
        this.action = action;
    }

    public String action() {
        return this.action;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static ActivityAction findByAction(String action) {
        for (ActivityAction v : values()) {
            if (v.action().equals(action)) {
                return v;
            }
        }
        return null;
    }
}
