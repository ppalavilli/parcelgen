
package co.poynt.api.model;

public enum BusinessUserStatus {
    EMPLOYED("E"), TERMINATED("T");

    private String status;

    BusinessUserStatus(String status) {
        this.status = status;
    }

    public String status() {
        return this.status;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static BusinessUserStatus findByStatus(String status) {
        for (BusinessUserStatus v : values()) {
            if (v.status().equals(status)) {
                return v;
            }
        }
        return null;
    }
}
