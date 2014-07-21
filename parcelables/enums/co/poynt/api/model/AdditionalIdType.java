package co.poynt.api.model;

public enum AdditionalIdType {

	// @formatter:off
    DRIVERS_LICENCE("D"),
    PASSPORT("P"),
    NATIONAL_ID_CARD("N");
    // @formatter:on

	private String type;

	AdditionalIdType(String type) {
		this.type = type;
	}

	public String type() {
		return this.type;
	}

	// if enum list gets really large we can use a HashMap
	// based solution. but for small lists this is good enough
	public static AdditionalIdType findByType(String type) {
		for (AdditionalIdType v : values()) {
			if (v.type().equals(type)) {
				return v;
			}
		}
		return null;
	}
}
