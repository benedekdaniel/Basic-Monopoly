package com.nsa.cm6123.assessment.monopoly.board;

import org.junit.Test;

import static org.junit.Assert.*;

public class PropertyTest {

    private  static final int PRICE = 100;
    private  static final int RENT = 4;

    @Test
    public void getRentTest() {

        Property prop = new Property("Old Kent Road", PRICE, RENT);

        assertEquals(RENT, prop.getRent());
    }
}
