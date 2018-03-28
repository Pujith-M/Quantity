package com.company;

class Weight extends Quantity{
    public Weight(double magnitude, Units unit){
        super(magnitude, unit);
    }

    public Weight add(Weight that){
        Quantity thisPlusThat = super.add(that);
        return new Weight(thisPlusThat.magnitude, thisPlusThat.unit);
    }
}
