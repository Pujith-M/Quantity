package com.company;

import java.util.Objects;

//Understands conversions
public class Length {

    private double magnitude;
    private Units unit;

    private Length(double magnitude, Units unit) {
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

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        return this.compare((Length) that);
    }

    private boolean compare(Length that) {
        return this.magnitude == that.unit.convertToOtherUnit(this.unit, that.magnitude);
    }

    @Override
    public String toString() {
        return "Length{" +
                "magnitude=" + magnitude +
                ", unit=" + unit +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(unit, magnitude);
    }

    public Length add(Length that) {
        double thatConvertedValue = that.unit.convertToOtherUnit(this.unit, that.magnitude);
        return new Length(this.magnitude + thatConvertedValue, this.unit);
    }
}
