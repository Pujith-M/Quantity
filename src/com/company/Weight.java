package com.company;

class Weight extends Quantity{
    public Weight(double magnitude, Units unit){
        super(magnitude, unit);
    }

    public Weight add(Weight that){
        return new Weight(super.add(that), this.unit);
    }
}
