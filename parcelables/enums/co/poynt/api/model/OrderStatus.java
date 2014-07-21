package co.poynt.api.model;

public enum OrderStatus {
	OPENED("O"), CANCELLED("C"), COMPLETED("M");

	private String status;

	OrderStatus(String status) {
		this.status = status;
	}

	public String status() {
		return this.status;
	}

	// if enum list gets really large we can use a HashMap
	// based solution. but for small lists this is good enough
	public static OrderStatus findByStatus(String status) {
		for (OrderStatus v : values()) {
			if (v.status().equals(status)) {
				return v;
			}
		}
		return null;
	}
}
