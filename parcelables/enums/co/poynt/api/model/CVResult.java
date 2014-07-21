package co.poynt.api.model;

public enum CVResult {

	// @formatter:off
    MATCH("M"),
    NO_MATCH("N"),
    NOT_PROCESSED("P"),
    NO_CODE_PRESENT("C"),
    SHOULD_HAVE_BEEN_PRESENT("S"),
    ISSUER_NOT_CERTIFIED("I"),
    INVALID("V"),
    NO_RESPONSE("R"),
    NOT_APPLICABLE("A");
    // @formatter:on

	private String result;

	CVResult(String result) {
		this.result = result;
	}

	public String result() {
		return this.result;
	}

	// if enum list gets really large we can use a HashMap
	// based solution. but for small lists this is good enough
	public static CVResult findByResult(String result) {
		for (CVResult v : values()) {
			if (v.result().equals(result)) {
				return v;
			}
		}
		return null;
	}
}
