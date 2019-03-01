package com.nsa.cm6123.assessment.monopoly.board;

import java.util.concurrent.atomic.AtomicInteger;

public class Field {
    private final String name;
    private final int price;
    private final AtomicInteger iX = new AtomicInteger(1);
    private final int index;

    Field(final String aName, final int aPrice) {
        this.name = aName;
        this.price = aPrice;
        index = iX.incrementAndGet();

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
