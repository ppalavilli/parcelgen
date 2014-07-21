package co.poynt.api.model;

public enum DELETE_CashTenderStatus {
	// @formatter:off
    TENDERED("T"),
    CLOSED("C");
    // will use flag to mark whether a capture has SETTLED or not;
    // that can't be stored in the status column as PARTIALLY
    // REFUNDED or REFUNDED could override it or vice versa and
    // we'll end up loosing information
    // @formatter:on

	private String status;

	DELETE_CashTenderStatus(String status) {
		this.status = status;
	}

	public String status() {
		return this.status;
	}

	// if enum list gets really large we can use a HashMap
	// based solution. but for small lists this is good enough
	public static DELETE_CashTenderStatus findByStatus(String status) {
		for (DELETE_CashTenderStatus v : values()) {
			if (v.status().equals(status)) {
				return v;
			}
		}
		return null;
	}
}
