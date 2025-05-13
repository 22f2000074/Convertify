
package io.github.stu22f2000074.convertify.model;
import java.math.BigDecimal;

public enum LengthUnit implements Unit {
    METER("Meter", "m", "1.0"),                      // Base unit
    KILOMETER("Kilometer", "km", "1000.0"),          // 1 km = 1000 m
    CENTIMETER("Centimeter", "cm", "0.01"),           // 1 cm = 0.01 m
    MILLIMETER("Millimeter", "mm", "0.001"),          // 1 mm = 0.001 m
    MILE("Mile", "mi", "1609.344"),           // 1 mi = 1609.344 m
    YARD("Yard", "yd", "0.9144"),            // 1 yd = 0.9144 m
    FOOT("Foot", "ft", "0.3048"),             // 1 ft = 0.3048 m
    INCH("Inch", "in", "0.0254");             // 1 in = 0.0254 m

    // Private final fields to store the properties of each unit constant.
    private final String fullName;
    private final String symbol;
    private final BigDecimal factorToMeter;


    private LengthUnit(String fullName, String symbol, String factorString) {
        this.fullName = fullName;
        this.symbol = symbol;
        this.factorToMeter=new BigDecimal(factorString);
    }


    @Override
    public String getName() {
        return this.fullName;
    }

    @Override
    public String getSymbol() {
        return this.symbol;
    }

    @Override
    public UnitType getUnitType() {
        // All units defined in this enum are of type LENGTH.
        return UnitType.Length;
    }
    public BigDecimal getFactorToMeter(){
        return this.factorToMeter;
    }
}