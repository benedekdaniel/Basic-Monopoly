package com.nsa.cm6123.assessment.monopoly;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void diceRollNotMoreThan13() {

        assertTrue(Dice.diceRoll() < 13);
    }

    @Test
    public void diceIsNotANegativeNumber() {

        assertFalse(Dice.diceRoll() <= 1);

    }
}
