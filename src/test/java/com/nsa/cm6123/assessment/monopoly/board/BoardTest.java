package com.nsa.cm6123.assessment.monopoly.board;

import com.nsa.cm6123.assessment.monopoly.game.ConstantDice;
import com.nsa.cm6123.assessment.monopoly.game.IDice;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {

    private static final int EXPECTED_SIZE = 40;

    private Board board;

    @Before
    public void init() {
        board = new Board();
    }


    @Test
    public void testMoveToFunction() {

        assertEquals(board.moveTo(board.getFieldlist().get(2)
                , 1), board.getFieldlist().get(3));
    }

    @Test(expected = ArithmeticException.class)
    public void cantMoveBackwardsTest() {

        IDice dice = new ConstantDice(-5);

       board.moveTo(board.getStartField(), dice.diceRoll());
    }

    @Test
    public void boardIndexTest() {


        assertSame(board.getStartField(), board.getFieldlist().get(0));
    }

    @Test
    public void boardSizeEqualsTo40() {

        assertEquals(EXPECTED_SIZE, board.boardSize());
    }

    @Test
    public void startFieldIsEqualsToTheFirstField() {
        assertEquals(board.getFieldlist().get(0), board.getStartField());
    }

}
