package com.nsa.cm6123.assessment.monopoly.game;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    private Dice theDice;


    @Before
    public void constructDice() {
        theDice = new Dice();
    }


    @Test
    public void diceRollNotMoreThan13() {


        assertTrue(theDice.diceRoll() < 13);
    }

    @Test
    public void diceIsNotANegativeNumber() {

        assertFalse(theDice.diceRoll() <= 1);

    }

    @Test
    public void makeSureConstantDiceGivesBackAppropriateValue() {

        IDice constDice = new ConstantDice(6);

        assertEquals(constDice.diceRoll(), 6);

    }
}
