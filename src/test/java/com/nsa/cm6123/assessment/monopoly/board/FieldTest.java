package com.nsa.cm6123.assessment.monopoly.board;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FieldTest {

    private static final int EXPECTED = 60;
    private static final int EXPECTED_START = 0;
    private Board board;

    @Before
    public void init() {

        board = new Board();

    }

    @Test
    public void getNameTest() {

        assertEquals("Community Chest", board.getFieldlist().get(2).getName());
    }


    @Test
    public void getPriceTest() {


        assertEquals(EXPECTED, board.getFieldlist().get(1).getPrice());
    }

    @Test
    public void getIndexTest() {

        assertEquals(EXPECTED_START, board.getFieldlist().get(0).getIndex());
    }

    @Test
    public void toStringEquals() {

        String expectedObject = "Location = " +
                "GO" + " price is = " + EXPECTED;
        assertEquals(expectedObject, board.getStartField().toString());
    }

}
