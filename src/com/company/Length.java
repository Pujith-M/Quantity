package com.company;

class Length extends Quantity{
    public Length(double magnitude, Units unit){
        super(magnitude, unit);
    }

    public Length add(Length that){
        return new Length(super.add(that), this.unit);
    }
}
