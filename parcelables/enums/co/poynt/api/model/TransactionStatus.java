package co.poynt.api.model;

public enum TransactionStatus {
	// @formatter:off
    CREATED("S"),
    SAVED("Z"),
    AUTHORIZED("A"),
    CAPTURED("C"),
    DECLINED("D"),
    PARTIALLY_REFUNDED("P"),
    REFUNDED("R"),
    VOIDED("V");
    // will use flag to mark whether a capture has SETTLED or not;
    // that can't be stored in the status column as PARTIALLY
    // REFUNDED or REFUNDED could override it or vice versa and
    // we'll end up loosing information
    // @formatter:on

	private String status;

	TransactionStatus(String status) {
		this.status = status;
	}

	public String status() {
		return this.status;
	}

	// if enum list gets really large we can use a HashMap
	// based solution. but for small lists this is good enough
	public static TransactionStatus findByStatus(String status) {
		for (TransactionStatus v : values()) {
			if (v.status().equals(status)) {
				return v;
			}
		}
		return null;
	}
}
