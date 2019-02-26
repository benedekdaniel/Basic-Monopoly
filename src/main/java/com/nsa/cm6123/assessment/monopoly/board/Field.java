package com.nsa.cm6123.assessment.monopoly.board;

public class Field {
    private final String name;
    private final int price;
    private final int index;

    public Field(final String aname, final int aprice, final int ix) {
        this.name = aname;
        this.price = aprice;
        index = ix;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getIndex() {
        return index;
    }

    Field applyAction() {
        return this;
    }

    @Override
    public String toString() {
        return String.format("%s |cost is: %d", name, price);
    }

}
