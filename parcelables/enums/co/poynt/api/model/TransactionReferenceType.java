package co.poynt.api.model;

public enum TransactionReferenceType {
	POYNT_ORDER("P"), CUSTOM("C");

	private String type;

	TransactionReferenceType(String type) {
		this.type = type;
	}

	public String type() {
		return this.type;
	}

	// if enum list gets really large we can use a HashMap
	// based solution. but for small lists this is good enough
	public static TransactionReferenceType findByType(String type) {
		for (TransactionReferenceType v : values()) {
			if (v.type().equals(type)) {
				return v;
			}
		}
		return null;
	}
}
