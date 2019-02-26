package com.nsa.cm6123.assessment.monopoly;


import com.nsa.cm6123.assessment.monopoly.board.Board;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class BoardTest {


    @Test
    public void boardIndexTest() {

        Board x = new Board();

        assertTrue(x.getStartField() == x.fieldList.get(0));
    }

//    @Test
//    public void boardSizeEqualsTo31() {
//
//        Board y = new Board();
//
//        assertTrue(y.size() == 31);
//    }
}
