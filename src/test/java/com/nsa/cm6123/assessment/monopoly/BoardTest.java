package com.nsa.cm6123.assessment.monopoly;


import com.nsa.cm6123.assessment.monopoly.board.Board;
import com.nsa.cm6123.assessment.monopoly.board.Field;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BoardTest {

    private Board board;

    @Before
    public void init() {
        board = new Board();
    }

    @Test
    public void boardIndexTest() {


        assertTrue(board.getStartField() == board.fieldList.get(0));
    }

    @Test
    public void boardSizeEqualsTo40() {

        assertTrue(board.boardSize() == 40);
    }

    @Test
    public void startFieldIsEqualsToTheFirstField(){
        assertEquals(board.getStartField(), board.fieldList.get(0));
    }
}
