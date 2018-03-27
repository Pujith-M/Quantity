package com.company;

enum Units {
    INCH(1), FEET(12), YARD(36);

    private final double conversionFactor;

    Units(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }


    double convertToOtherUnit(Units unit, double magnitude) {
        return magnitude * this.conversionFactor / unit.conversionFactor;
    }
}
