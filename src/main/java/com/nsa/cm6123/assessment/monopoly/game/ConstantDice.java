package com.nsa.cm6123.assessment.monopoly.game;

public class ConstantDice implements IDice {

    //Creating a constant dice that will give back exact numbers for testing

    private int constantRoll;

    public ConstantDice(final int constantNum) {
        constantRoll = constantNum;
    }

    @Override
    public int diceRoll() {
        return constantRoll;
    }
}
