package co.poynt.api.model;

public enum TransactionAction {
	// @formatter:off
    //SAVE("B"),
	AUTHORIZE("A"),
    CAPTURE("C"),
    SALE("S"),
    NON_REFERENCED_REFUND("N"), // original credit
    // void will be a status update of the AUTH row
    // adjust will be noted separately in some satellite table
    REFUND("R");
    // @formatter:on

	private String action;

	TransactionAction(String action) {
		this.action = action;
	}

	public String action() {
		return this.action;
	}

	// if enum list gets really large we can use a HashMap
	// based solution. but for small lists this is good enough
	public static TransactionAction findByAction(String action) {
		for (TransactionAction v : values()) {
			if (v.action().equals(action)) {
				return v;
			}
		}
		return null;
	}
}
