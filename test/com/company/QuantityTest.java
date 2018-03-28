package com.company;

import org.junit.Test;

import static com.company.Quantity.*;
import static org.junit.Assert.*;

public class QuantityTest {
    @Test
    public void equalWhenTwelveInchAndTwelveInch() {
        assertEquals(inch(12), inch(12));
    }
    @Test
    public void equalWhenTwelveInchAndOneFeet() {
        assertEquals(inch(12), feet(1));
    }

    @Test
    public void equalWhenTwoFeetAndTwentyFourInch() {
        assertEquals(feet(2), inch(24));
    }

    @Test
    public void equalWhenOneYardAndThreeFeet() {
        assertEquals(yard(1), feet(3));
    }

    @Test
    public void equalWhenTwoYardsAndSeventyTwoInch(){
        assertEquals(yard(2),inch(72));
    }

    @Test
    public void addingFourInchAndOneYard(){
        assertEquals(inch(40), inch(4).add(yard(1)));
    }

    @Test
    public void addingTwentyFourInchAndOneFootExpectingOneYard(){
        assertEquals(yard(1), inch(24).add(feet(1)));
    }

    @Test
    public void equalWhenThousandGramsAndOneKilogram(){
        assertEquals(gram(1000), kilogram(1));
    }

    @Test
    public void addingOnePoundAndFiveHundredFortySevenGramsExpectingOneKilogram(){
        assertEquals(kilogram(1), pound(1).add(gram(547)));
    }

    @Test
    public void notEqualWhenOneGramsAndOneInch(){
        assertNotEquals(gram(1), inch(1));
    }


}