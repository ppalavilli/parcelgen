package co.poynt.api.model;

public enum AVSResultType {

	// @formatter:off
    MATCH("M"),
    NO_MATCH("N"),
    NOT_PROVIDED("P"),
    ISSUER_NOT_CERTIFIED("I"),
    NO_RESPONSE_FROM_CARD_ASSOCIATION("R"),
    UNKNOWN_RESPONSE_FROM_CARD_ASSOCIATION("U"),
    NOT_VERIFIED("V"),
    BAD_FORMAT("B");
    // @formatter:on

	private String type;

	AVSResultType(String type) {
		this.type = type;
	}

	public String type() {
		return this.type;
	}

	// if enum list gets really large we can use a HashMap
	// based solution. but for small lists this is good enough
	public static AVSResultType findByType(String type) {
		for (AVSResultType v : values()) {
			if (v.type().equals(type)) {
				return v;
			}
		}
		return null;
	}
}
