package com.nsa.cm6123.assessment.monopoly;

import java.util.Random;
//Importing the Java random library for the dice method.

/**
 * Dice
 */
public class Dice {

    //Creating a new instance of the Random class for the dice.
    private static Random dice = new Random();
    private static final int MAX_DICE_ROLL = 6;

    private Dice() {

    }

    public static int diceRoll() {

        /**
         * As Monopoly rules involves the use of 2 dices,
         * that is what I implementing
         * here with the use of random numbers and returning
         * the final result.
         */

        int rollDice1;
        int rollDice2;
        rollDice1 = dice.nextInt(MAX_DICE_ROLL) + 1;
        rollDice2 = dice.nextInt(MAX_DICE_ROLL) + 1;
        int finalDice = rollDice1 + rollDice2;
        return finalDice;
    }
    }
