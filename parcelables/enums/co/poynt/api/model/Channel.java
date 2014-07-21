
package co.poynt.api.model;

public enum Channel {
    // @formatter:off
    TERMINAL("T"),
    WIFI_SENSOR("W"),
    WEB("I"),
    API("A");
    // @formatter:on

    private String channel;

    Channel(String channel) {
        this.channel = channel;
    }

    public String channel() {
        return this.channel;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static Channel findByChannel(String channel) {
        for (Channel v : values()) {
            if (v.channel().equals(channel)) {
                return v;
            }
        }
        return null;
    }
}
