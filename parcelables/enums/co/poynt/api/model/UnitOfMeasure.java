
package co.poynt.api.model;

public enum UnitOfMeasure {

    // @formatter:off
    EACH("EA"),
    HOURS("Hours"),
    DAYS("Days"),
    SECONDS("Seconds"),
    CRATE_OF_12("Crate of 12"), // in spec: Crate of 12 = Crate of 12 bottles of
                                // beer
    SIX_PACH("6 Pack"),
    GALLON("GLL"), // removed GALLON("GLI") for now: UK standard
    LITRE("LTR"),
    INCH("INH"),
    FOOT("FOT"),
    MILLIMETER("MMT"),
    CENTIMETER("CMQ"),
    METER("MTR"),
    SQUARE_METER("MTK"),
    CUBIC_METER("MTQ"),
    GRAM("GRM"),
    KILOGRAM("KGM"), // removed KILOGRAM("Kg") for now to avoid duplicate
    POUND("LBR"),
    ANNUAL("ANN"),
    DEGREE_CELCIUS("CEL"),
    DEGREE_FARENHEIT("FAH");
    // @formatter:on

    private String unitOfMeasure;

    UnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public String unitOfMeasure() {
        return this.unitOfMeasure;
    }

    // if enum list gets really large we can use a HashMap
    // based solution. but for small lists this is good enough
    public static UnitOfMeasure findByUnitOfMeasure(String unitOfMeasure) {
        for (UnitOfMeasure v : values()) {
            if (v.unitOfMeasure().equals(unitOfMeasure)) {
                return v;
            }
        }
        return null;
    }
}
