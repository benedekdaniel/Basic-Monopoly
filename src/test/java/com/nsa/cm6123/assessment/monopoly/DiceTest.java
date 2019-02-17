package com.nsa.cm6123.assessment.monopoly;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    private Dice dice;

    @Before
    public void setUp(){
        dice = new Dice();
    }

    @Test
    public void diceRollNotMoreThan13() {

        assertTrue(dice.diceRoll() < 13);
    }

    @Test
    public void diceIsNotANegativeNumber() {

        assertFalse(dice.diceRoll() <= 1);

    }
}