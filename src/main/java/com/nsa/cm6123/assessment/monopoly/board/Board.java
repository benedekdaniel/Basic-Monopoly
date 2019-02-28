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

        fieldList.add(new Field("GO", SIXTY));
        fieldList.add(new Field("Old Kent Road", SIXTY));
        fieldList.add(new Field("Community Chest", ZERO));
        fieldList.add(new Field("Whitechapel Road", SIXTY));
        fieldList.add(new Field("Income Tax", TWOHUNDRED));
        fieldList.add(new Field("Kings Cross Station", SIXTY));
        fieldList.add(new Field("The angel, Islington", HUNDRED));
        fieldList.add(new Field("CHANCE", ZERO));
        fieldList.add(new Field("Euston Road", HUNDRED));
        fieldList.add(new Field("Pentonville Road", HUNDREDTWENTY));
        fieldList.add(new Field("Just Visiting Jail", ZERO));
        fieldList.add(new Field("Pall Mall", HUNDREDFORTY));
        fieldList.add(new Field("Electric Company", HUNDREDFORTY));
        fieldList.add(new Field("WhiteHall", HUNDREDFORTY));
        fieldList.add(new Field("NorthHumrl'd Avenue", HUNDREDSIXTY));
        fieldList.add(new Field("MaryLebone Station", TWOHUNDRED));
        fieldList.add(new Field("Community Chest", SIXTY));
        fieldList.add(new Field("Bow Street", HUNDREDEIGHTY));
        fieldList.add(new Field("Marlborough Street", HUNDREDEIGHTY));
        fieldList.add(new Field("Vine Street", TWOHUNDRED));
        fieldList.add(new Field("Free Parking", ZERO));
        fieldList.add(new Field("Strand", TWOHUNDREDTWENTY));
        fieldList.add(new Field("CHANCE", ZERO));
        fieldList.add(new Field("Fleet Street", TWOHUNDREDTWENTY));
        fieldList.add(new Field("Trafalgar Square", TWOHUNDREDFORTY));
        fieldList.add(new Field("Fenchurch St. Station", TWOHUNDRED));
        fieldList.add(new Field("Leicester Square", TWOHUNDREDSIXTY));
        fieldList.add(new Field("Coventry Street", TWOHUNDREDSIXTY));
        fieldList.add(new Field("Water Works", HUNDREDFIFTY));
        fieldList.add(new Field("Piccadilly", TWOHUNDREDEIGHTY));
        fieldList.add(new Field("Go to jail", ZERO));
        fieldList.add(new Field("Regent Street", THREEHUNDRED));
        fieldList.add(new Field("Oxford Street", THREEHUNDRED));
        fieldList.add(new Field("Community Chest", ZERO));
        fieldList.add(new Field("Bond Street", THREEHUNDREDTWENTY));
        fieldList.add(new Field("Liverpool St. Station", TWOHUNDRED));
        fieldList.add(new Field("CHANCE", ZERO));
        fieldList.add(new Field("Park Lane", THREEHUNDREDFIFTY));
        fieldList.add(new Field("Super Tax", HUNDRED));
        fieldList.add(new Field("Mayfair", FOURHUNDRED));
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
        if (nextIndex > boardSize()) {
            nextIndex = boardSize() - 1;
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
