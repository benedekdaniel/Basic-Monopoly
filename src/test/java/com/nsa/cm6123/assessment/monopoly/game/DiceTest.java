package com.nsa.cm6123.assessment.monopoly.game;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {



    @Test
    public void diceRollNotMoreThan13() {

        IDice dice = new Dice();

        assertTrue(dice.diceRoll() < 13);
    }

    @Test
    public void diceIsNotANegativeNumber() {

        IDice dice = new Dice();

        assertFalse(dice.diceRoll() <= 1);

    }

    @Test
    public void makeSureConstantDiceGivesBackAppropriateValue() {

        IDice dice = new ConstantDice(5);

        assertEquals(dice.diceRoll(), 5);

    }
}
