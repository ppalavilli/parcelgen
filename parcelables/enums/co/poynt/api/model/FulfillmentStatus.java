package co.poynt.api.model;

public enum FulfillmentStatus {
	NONE("N"), PARTIAL("P"), FULFILLED("F");

	private String status;

	FulfillmentStatus(String status) {
		this.status = status;
	}

	public String status() {
		return this.status;
	}

	// if enum list gets really large we can use a HashMap
	// based solution. but for small lists this is good enough
	public static FulfillmentStatus findByStatus(String status) {
		for (FulfillmentStatus v : values()) {
			if (v.status().equals(status)) {
				return v;
			}
		}
		return null;
	}
}
