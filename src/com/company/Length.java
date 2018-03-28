package com.company;

class Length extends Quantity{
    public Length(double magnitude, Units unit){
        super(magnitude, unit);
    }

    public Length add(Length that){
        Quantity thisPlusThat = super.add(that);
        return new Length(thisPlusThat.magnitude, thisPlusThat.unit);
    }
}
