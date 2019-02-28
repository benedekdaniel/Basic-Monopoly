package com.nsa.cm6123.assessment.monopoly;


import com.nsa.cm6123.assessment.monopoly.board.Board;
import com.nsa.cm6123.assessment.monopoly.board.Field;
import com.nsa.cm6123.assessment.monopoly.player.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {

    private Board board;

    @Before
    public void init() {
        board = new Board();
    }

    @Test
    public void testMoveToFunction() {



        assertSame(board.fieldList.get(3), board.moveTo(board.fieldList.get(2), 1));
    }

    @Test
    public void boardIndexTest() {


        assertSame(board.getStartField(), board.fieldList.get(0));
    }

    @Test
    public void boardSizeEqualsTo40() {

        assertEquals(board.boardSize(), 40);
    }

    @Test
    public void startFieldIsEqualsToTheFirstField() {
        assertEquals(board.getStartField(), board.fieldList.get(0));
    }


}
