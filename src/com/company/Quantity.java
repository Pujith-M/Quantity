package com.company;

import java.util.Objects;

//Understands conversions
public class Quantity {

    protected double magnitude;
    protected Units unit;

    protected Quantity(double magnitude, Units unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    static Length feet(double value) {
        return new Length(value, Units.FEET);
    }

    static Length inch(double value) {
        return new Length(value, Units.INCH);
    }

    static Length yard(double value) {
        return new Length(value, Units.YARD);
    }

    static Weight kilogram(double value) {
        return new Weight(value, Units.KILOGRAM);
    }

    static Weight gram(double value) {
        return new Weight(value, Units.GRAM);
    }

    static Weight pound(double value) {
        return new Weight(value, Units.POUND);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        return this.compare((Quantity) that);
    }

    private boolean compare(Quantity that) {
        return Math.abs(this.magnitude - that.unit.convertToOtherUnit(this.unit, that.magnitude)) < 0.005;
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "magnitude=" + magnitude +
                ", unit=" + unit +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(unit, magnitude);
    }

    protected double add(Quantity that) {
        double thatConvertedValue = that.unit.convertToOtherUnit(this.unit, that.magnitude);
//        return new Quantity(this.magnitude + thatConvertedValue, this.unit);
        return this.magnitude + thatConvertedValue;
    }
}

