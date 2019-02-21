package com.nsa.cm6123.assessment.monopoly;

public class Field {
    private final String name;
    private final int price;

    public Field(final String aname, final int aprice) {
        this.name = aname;
        this.price = aprice;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s |cost is: %d", name, price);
    }

}
