package com.nsa.cm6123.assessment.monopoly.board;

import java.util.ArrayList;

public class Board {

    private static final int ZERO = 0;
    private static final int SIXTY = 60;
    private static final int HUNDRED = 100;
    private static final int TWOHUNDRED = 200;
    private static final int HUNDREDTWENTY = 120;
    private static final int HUNDREDFORTY = 140;
    private static final int HUNDREDFIFTY = 150;
    private static final int HUNDREDSIXTY = 160;
    private static final int HUNDREDEIGHTY = 180;
    private static final int TWOHUNDREDTWENTY = 220;
    private static final int TWOHUNDREDFORTY = 240;
    private static final int TWOHUNDREDSIXTY = 260;
    private static final int TWOHUNDREDEIGHTY = 280;
    private static final int THREEHUNDRED = 300;
    private static final int THREEHUNDREDTWENTY = 320;
    private static final int THREEHUNDREDFIFTY = 350;
    private static final int FOURHUNDRED = 400;



    public ArrayList<Field> fieldList;

     public Board() {

        makeBoard();

    }

    private void makeBoard() {

        fieldList = new ArrayList<Field>();

        //Implementing the fields for Monopoly London

        fieldList.add(new Field("GO", SIXTY, 1));
        fieldList.add(new Field("Old Kent Road", SIXTY, 2));
        fieldList.add(new Field("Community Chest", ZERO, 3));
        fieldList.add(new Field("Whitechapel Road", SIXTY, 4));
        fieldList.add(new Field("Income Tax", TWOHUNDRED, 5));
        fieldList.add(new Field("Kings Cross Station", SIXTY, 6));
        fieldList.add(new Field("The angel, Islington", HUNDRED, 7));
        fieldList.add(new Field("CHANCE", ZERO, 8));
        fieldList.add(new Field("Euston Road", HUNDRED, 9));
        fieldList.add(new Field("Pentonville Road", HUNDREDTWENTY, 10));
        fieldList.add(new Field("Just Visiting Jail", ZERO, 11));
        fieldList.add(new Field("Pall Mall", HUNDREDFORTY, 12));
        fieldList.add(new Field("Electric Company", HUNDREDFORTY, 13));
        fieldList.add(new Field("WhiteHall", HUNDREDFORTY, 14));
        fieldList.add(new Field("NorthHumrl'd Avenue", HUNDREDSIXTY, 15));
        fieldList.add(new Field("MaryLebone Station", TWOHUNDRED, 16));
        fieldList.add(new Field("Community Chest", SIXTY, 17));
        fieldList.add(new Field("Bow Street", HUNDREDEIGHTY, 18));
        fieldList.add(new Field("Marlborough Street", HUNDREDEIGHTY, 19));
        fieldList.add(new Field("Vine Street", TWOHUNDRED, 20));
        fieldList.add(new Field("Free Parking", ZERO, 21));
        fieldList.add(new Field("Strand", TWOHUNDREDTWENTY, 22));
        fieldList.add(new Field("CHANCE", ZERO, 23));
        fieldList.add(new Field("Fleet Street", TWOHUNDREDTWENTY, 24));
        fieldList.add(new Field("Trafalgar Square", TWOHUNDREDFORTY, 25));
        fieldList.add(new Field("Fenchurch St. Station", TWOHUNDRED, 26));
        fieldList.add(new Field("Leicester Square", TWOHUNDREDSIXTY, 27));
        fieldList.add(new Field("Coventry Street", TWOHUNDREDSIXTY, 28));
        fieldList.add(new Field("Water Works", HUNDREDFIFTY, 29));
        fieldList.add(new Field("Piccadilly", TWOHUNDREDEIGHTY, 30));
        fieldList.add(new Field("Go to jail", ZERO, 31));
        fieldList.add(new Field("Regent Street", THREEHUNDRED, 32));
        fieldList.add(new Field("Oxford Street", THREEHUNDRED, 33));
        fieldList.add(new Field("Community Chest", ZERO, 34));
        fieldList.add(new Field("Bond Street", THREEHUNDREDTWENTY, 35));
        fieldList.add(new Field("Liverpool St. Station", TWOHUNDRED, 36));
        fieldList.add(new Field("CHANCE", ZERO, 37));
        fieldList.add(new Field("Park Lane", THREEHUNDREDFIFTY, 38));
        fieldList.add(new Field("Super Tax", HUNDRED, 39));
        fieldList.add(new Field("Mayfair", FOURHUNDRED, 40));
    }

    //Getting the start field

    public Field getStartField() {
        return fieldList.get(0);
    }

    //getting the size of the board back

    public int boardSize() {
        return fieldList.size();
    }

    //Getting back the field the player will move on.

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
