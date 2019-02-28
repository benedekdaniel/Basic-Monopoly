package com.nsa.cm6123.assessment.monopoly.board;

import java.util.ArrayList;

public class Board {

    public ArrayList<Field> fieldList;

    public Board() {

        fieldList = new ArrayList<Field>();

        //Implementing the fields for Monopoly
        fieldList.add(new Field("GO", 60, 1));
        fieldList.add(new Field("Old Kent Road", 60, 2));
        fieldList.add(new Field("Community Chest", 0, 3));
//        These are going to be subclasses classes of the Field class
        fieldList.add(new Field("Whitechapel Road", 60,4));
        fieldList.add(new Field("Income Tax", 200,5));
        fieldList.add(new Field("Kings Cross Station", 60,6));
        fieldList.add(new Field("The angel, Islington", 100,7));
        fieldList.add(new Field("CHANCE", 0,8));
        fieldList.add(new Field("Euston Road", 100,9));
        fieldList.add(new Field("Pentonville Road", 120,10));
        fieldList.add(new Field("Just Visiting Jail", 0,11));
        fieldList.add(new Field("Pall Mall", 140,12));
        fieldList.add(new Field("Electric Company", 140,13));
        fieldList.add(new Field("WhiteHall", 140,14));
        fieldList.add(new Field("NorthHumrl'd Avenue", 160,15));
        fieldList.add(new Field("MaryLebone Station", 200,16));
        fieldList.add(new Field("Community Chest", 60, 17));
        fieldList.add(new Field("Bow Street", 180,18));
        fieldList.add(new Field("Marlborough Street", 180,19));
        fieldList.add(new Field("Vine Street", 200,20));
        fieldList.add(new Field("Free Parking", 0,21));
        fieldList.add(new Field("Strand", 220,22));
        fieldList.add(new Field("CHANCE2", 0,23));
        fieldList.add(new Field("Fleet Street", 220,24));
        fieldList.add(new Field("Trafalgar Square", 240,25));
        fieldList.add(new Field("Fenchurch St. Station", 200,26));
        fieldList.add(new Field("Leicester Square", 260,27));
        fieldList.add(new Field("Coventry Street", 260,28));
        fieldList.add(new Field("Water Works", 150,29));
        fieldList.add(new Field("Piccadilly", 280,30));
        fieldList.add(new Field("Go to jail", 0,31));
        fieldList.add(new Field("Regent Street", 300,32));
        fieldList.add(new Field("Oxford Street", 300,33));
        fieldList.add(new Field("Community Chest", 0,34));
        fieldList.add(new Field("Bond Street", 320,35));
        fieldList.add(new Field("Liverpool St. Station", 200,36));
        fieldList.add(new Field("CHANCE3", 0,37));
        fieldList.add(new Field("Park Lane", 350,38));
        fieldList.add(new Field("Super Tax", 100,39));
        fieldList.add(new Field("Mayfair", 400,40));

    }

    public Field getStartField() {
        return fieldList.get(0);
    }

    public int boardSize() {
        return fieldList.size();
    }

    public Field moveTo(final Field from, final int dice) {

        int nextIndex = from.getIndex() - 1 + dice;
        if (nextIndex > fieldList.size()) {
            nextIndex = fieldList.size() - 1;
        }

        return fieldList.get(nextIndex).applyAction();
    }


    @Override
    public String toString() {
        return "Board{" +
                "fieldList=" + fieldList +
                '}';
    }
}
