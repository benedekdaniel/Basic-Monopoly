package com.nsa.cm6123.assessment.monopoly.game;

public class ConstantDice implements IDice {

    private int constantRoll;

    public ConstantDice(final int constantNum) {
        constantRoll = constantNum;
    }

    @Override
    public int diceRoll() {
        return constantRoll;
    }
}
