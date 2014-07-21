package co.poynt.api.model;

public enum DELETE_CashTenderAction {
	// @formatter:off
    PAYMENT("P"),
    REFUND("R");
    // @formatter:on

	private String action;

	DELETE_CashTenderAction(String action) {
		this.action = action;
	}

	public String action() {
		return this.action;
	}

	// if enum list gets really large we can use a HashMap
	// based solution. but for small lists this is good enough
	public static DELETE_CashTenderAction findByAction(String action) {
		for (DELETE_CashTenderAction v : values()) {
			if (v.action().equals(action)) {
				return v;
			}
		}
		return null;
	}
}
