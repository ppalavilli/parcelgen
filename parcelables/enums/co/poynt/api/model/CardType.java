
package co.poynt.api.model;

public enum CardType {

    // @formatter:off
    AMERICAN_EXPRESS("A"),
    MAESTRO("E"),
    DISCOVER("D"),
    DINERS_CLUB("I"),
    JCB("J"),
    MASTERCARD("M"),
    DANKORT("N"),
    OTHER("O"),
    VISA("V");
    // @formatter:on

    private String type;

    CardType(String type) {
        this.type = type;
    }

    public String type() {
        return this.type;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static CardType findByType(String type) {
        for (CardType v : values()) {
            if (v.type().equals(type)) {
                return v;
            }
        }
        return null;
    }
}
