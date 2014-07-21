package co.poynt.api.model;

public enum CustomerPresenceStatus {

	// TODO: finalize this enum (as of 07/10/2014 its not finalized; should be
	// by end of the month)

	// @formatter:off
    PRESENT("P"),
    SUSPICIOUS("A"),
    BILL_PAYMENT("B"),
    TRANSPONDER("C"),
    MOTO("D"),
    VISA_OPEN_NETWORK_TRANSACTION("F"),
    VISA_CARD_PRESENT_STRIPE_UNREADABLE("G"),
    MAIL_FAX("H"),
    ECOMMERCE("E"),
    MCOMMERCE("I"),
    TELARU("J"),
    MOTOCC("K"),
    VOICE_RESPONSE("L");
    // @formatter:on

	private String status;

	CustomerPresenceStatus(String status) {
		this.status = status;
	}

	public String status() {
		return this.status;
	}

	// if enum list gets really large we can use a HashMap
	// based solution. but for small lists this is good enough
	public static CustomerPresenceStatus findByStatus(String status) {
		for (CustomerPresenceStatus v : values()) {
			if (v.status().equals(status)) {
				return v;
			}
		}
		return null;
	}
}
