
package co.poynt.api.model;

public enum Gender {
    MALE("M"),
    FEMALE("F");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String gender() {
        return this.gender;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static Gender findByGender(String gender) {
        for (Gender v : values()) {
            if (v.gender().equals(gender)) {
                return v;
            }
        }
        return null;
    }
}
