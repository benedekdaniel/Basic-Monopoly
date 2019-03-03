package com.nsa.cm6123.assessment.monopoly.board;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FieldTest {

    private static final int EXPECTED = 60;
    private static final int EXPECTED_NUM = 4;
    private Board theBoard;

    @Before
    public void initi() {

        theBoard = new Board();

    }

    @Test
    public void getNameTest() {

        assertEquals("Community Chest",
                theBoard.getFieldlist().get(2).getName());
    }


    @Test
    public void getPriceTest() {


        assertEquals(EXPECTED, theBoard.getFieldlist().get(0).getPrice());
    }


    @Test
    public void toStringEquals() {

        String expectedObject = "Location = " +
                "GO" + " price is = " + EXPECTED;
        assertEquals(expectedObject, theBoard.getStartField().toString());
    }

}
