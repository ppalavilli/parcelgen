package co.poynt.api.model;

public enum OrderItemStatus {

	// in v1, P was for PURCHASED and R was for RETURNED.
	// logically PURCHASED actually meant FULFILLED.
	// so in v2, we are simply re-using P for FULFILLED (which is a new state
	// that we are adding) and assigned O to ORDERED.

	ORDERED("O"), FULFILLED("P"), RETURNED("R");

	private String status;

	OrderItemStatus(String status) {
		this.status = status;
	}

	public String status() {
		return this.status;
	}

	// if enum list gets really large we can use a HashMap
	// based solution. but for small lists this is good enough
	public static OrderItemStatus findByStatus(String status) {
		for (OrderItemStatus v : values()) {
			if (v.status().equals(status)) {
				return v;
			}
		}
		return null;
	}
}
