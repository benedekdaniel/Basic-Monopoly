package com.nsa.cm6123.assessment.monopoly.board;

public class Property extends Field {

    private final int rent;

    public Property(final String aName, final int aPrice, final int aRent) {
        super(aName, aPrice);
        this.rent = aRent;

    }

    public int getRent() {
        return rent;
    }
}
