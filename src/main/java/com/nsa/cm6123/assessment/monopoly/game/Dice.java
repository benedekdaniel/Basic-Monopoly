package com.nsa.cm6123.assessment.monopoly.game;

import java.util.Random;

public class Dice implements IDice {

    //Creating a new instance of the Random class for the dice.
    private static Random dice = new Random();
    private static final int MAX_DICE_ROLL = 6;

    /*
     * Implementing 2 dices
     */

    @Override
    public int diceRoll() {

        int rollDice1 = dice.nextInt(MAX_DICE_ROLL) + 1;
        // +1 because dice should roll from 1-6
        int rollDice2 = dice.nextInt(MAX_DICE_ROLL) + 1;


        return  rollDice1 + rollDice2;
    }


    }
