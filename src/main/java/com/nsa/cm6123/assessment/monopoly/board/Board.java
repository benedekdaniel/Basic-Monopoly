package com.nsa.cm6123.assessment.monopoly.board;

import java.util.ArrayList;

public class Board {

    public ArrayList<Field> fieldList;

    public Board() {
        makeBoard();
    }


    private void makeBoard() {

        fieldList = new ArrayList<Field>();

        //Implementing the fields for Monopoly
        fieldList.add(new Field("Old Kent Road", 60, 1));
        fieldList.add(new Field("Community Chest1", 0, 2));
        //These are going to be subclasses classes of the Field class
//        fieldList.add(new Property("Whitechapel Road", 60));
//        fieldList.add(new Field("Income Tax", 200));
//        fieldList.add(new Property("Kings Cross Station", 60));
//        fieldList.add(new Field("The angel, Islington", 100));
//        fieldList.add(new Field("CHANCE", 0));
//        fieldList.add(new Property("Euston Road", 100));
//        fieldList.add(new Property("Pentonville Road", 120));
//        fieldList.add(new Field("Just Visiting Jail", 0));
//        fieldList.add(new Property("Pall Mall", 140));
//        fieldList.add(new Field("Electric Company", 140));
//        fieldList.add(new Property("WhiteHall", 140));
//        fieldList.add(new Property("NorthHumrl'd Avenue", 160));
//        fieldList.add(new Field("MaryLebone Station", 200));
//        fieldList.add(new Field("Bow Street", 180));
//        fieldList.add(new Field("Marlborough Street", 180));
//        fieldList.add(new Field("Vine Street", 200));
//        fieldList.add(new Field("Free Parking", 0));
//        fieldList.add(new Field("Strand", 220));
//        fieldList.add(new Field("CHANCE2", 0));
//        fieldList.add(new Field("Fleet Street", 220));
//        fieldList.add(new Field("Trafalgar Square", 240));
//        fieldList.add(new Field("Fenchurch St. Station", 200));
//        fieldList.add(new Field("Leicester Square", 260));
//        fieldList.add(new Field("Coventry Street", 260));
//        fieldList.add(new Field("Water Works", 150));
//        fieldList.add(new Field("Piccadilly", 280));
//        fieldList.add(new Field("Go to jail", 0));
//        fieldList.add(new Field("Regent Street", 300));
//        fieldList.add(new Field("Oxford Street", 300));
//        fieldList.add(new Field("Community Chest", 0));
//        fieldList.add(new Field("Bond Street", 320));
//        fieldList.add(new Field("Liverpool St. Station", 200));
//        fieldList.add(new Field("CHANCE3", 0));
//        fieldList.add(new Field("Park Lane", 350));
//        fieldList.add(new Field("Super Tax", 100));
//        fieldList.add(new Field("Mayfair", 400));

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
