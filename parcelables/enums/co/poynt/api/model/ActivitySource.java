
package co.poynt.api.model;

public enum ActivitySource {

    // @formatter:off
    FOURSQUARE("4"),
    FACEBOOK("F"),
    SENSOR("S"),
    TWITTER("T"),
    YELP("Y");
    // @formatter:on

    private String source;

    ActivitySource(String source) {
        this.source = source;
    }

    public String source() {
        return this.source;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static ActivitySource findBySource(String source) {
        for (ActivitySource v : values()) {
            if (v.source().equals(source)) {
                return v;
            }
        }
        return null;
    }
}
