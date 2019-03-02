package com.nsa.cm6123.assessment.monopoly.board;

import java.util.concurrent.atomic.AtomicInteger;

public class Field {
    private final String name;
    //mayfair is 39
    private final int price;
    private static AtomicInteger iX = new AtomicInteger(0);
    private final int index;

    Field(final String aName, final int aPrice) {
        this.name = aName;
        this.price = aPrice;
        index = iX.getAndIncrement();
        if (index == 39) {
            iX.set(0);
        }


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


    @Override
    public String toString() {
        return String.format("%s |cost is: %d", name, price);
    }

}
