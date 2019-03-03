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
    private static final int RENT_2 = 2;
    private static final int RENT_4 = 4;
    private static final int RENT_5 = 5;
    private static final int RENT_6 = 6;
    private static final int RENT_8 = 8;
    private static final int RENT_10 = 10;



    private ArrayList<Field> fieldList;

     public Board() {

         //Building the board

        makeBoard();

    }

    private void makeBoard() {

        fieldList = new ArrayList<Field>();

        /* Implementing the fields for Monopoly London
         * In single ArrayList
         */

        fieldList.add(new Field("GO", SIXTY));
        fieldList.add(new Property("Old Kent Road", SIXTY, RENT_2));
        fieldList.add(new Field("Community Chest", ZERO));
        fieldList.add(new Property("Whitechapel Road", SIXTY, RENT_2));
        fieldList.add(new Field("Income Tax", TWOHUNDRED));
        fieldList.add(new Field("Kings Cross Station", SIXTY));
        fieldList.add(new Property("The angel, Islington", HUNDRED, RENT_4));
        fieldList.add(new Field("CHANCE", ZERO));
        fieldList.add(new Property("Euston Road", HUNDRED, RENT_4));
        fieldList.add(new Property("Pentonville Road", HUNDREDTWENTY, RENT_6));
        fieldList.add(new Field("Just Visiting Jail", ZERO));
        fieldList.add(new Property("Pall Mall", HUNDREDFORTY, RENT_6));
        fieldList.add(new Field("Electric Company", HUNDREDFORTY));
        fieldList.add(new Property("WhiteHall", HUNDREDFORTY, RENT_5));
        fieldList.add(new Property("NorthHumrl'd Avenue", HUNDREDSIXTY
                , RENT_8));
        fieldList.add(new Field("MaryLebone Station", TWOHUNDRED));
        fieldList.add(new Field("Community Chest", SIXTY));
        fieldList.add(new Property("Bow Street", HUNDREDEIGHTY, RENT_6));
        fieldList.add(new Property("Marlborough Street", HUNDREDEIGHTY
                , RENT_6));
        fieldList.add(new Property("Vine Street", TWOHUNDRED, RENT_6));
        fieldList.add(new Field("Free Parking", ZERO));
        fieldList.add(new Property("Strand", TWOHUNDREDTWENTY, RENT_6));
        fieldList.add(new Field("CHANCE", ZERO));
        fieldList.add(new Property("Fleet Street", TWOHUNDREDTWENTY, RENT_8));
        fieldList.add(new Property("Trafalgar Square", TWOHUNDREDFORTY
                , RENT_8));
        fieldList.add(new Field("Fenchurch St. Station", TWOHUNDRED));
        fieldList.add(new Property("Leicester Square", TWOHUNDREDSIXTY
                , RENT_8));
        fieldList.add(new Property("Coventry Street", TWOHUNDREDSIXTY, RENT_8));
        fieldList.add(new Field("Water Works", HUNDREDFIFTY));
        fieldList.add(new Property("Piccadilly", TWOHUNDREDEIGHTY, RENT_10));
        fieldList.add(new Field("Go to jail", ZERO));
        fieldList.add(new Property("Regent Street", THREEHUNDRED, RENT_10));
        fieldList.add(new Property("Oxford Street", THREEHUNDRED, RENT_5));
        fieldList.add(new Field("Community Chest", ZERO));
        fieldList.add(new Property("Bond Street", THREEHUNDREDTWENTY, RENT_10));
        fieldList.add(new Field("Liverpool St. Station", TWOHUNDRED));
        fieldList.add(new Field("CHANCE", ZERO));
        fieldList.add(new Property("Park Lane", THREEHUNDREDFIFTY, RENT_10));
        fieldList.add(new Field("Super Tax", HUNDRED));
        fieldList.add(new Property("Mayfair", FOURHUNDRED, RENT_10));
    }

  public ArrayList<Field> getFieldlist() {
         return fieldList;
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



        int nextIndex = from.getIndex() + dice;
        if (nextIndex < 0) {
            throw new ArithmeticException("You can't roll negative " +
                    "numbers");
        }
        if (nextIndex > boardSize()) {

            /*
             * If player on 39 and roll 6 nextindex is
             * 6 - (40-39) = 5
             */

            nextIndex = (dice - (boardSize() - from.getIndex()) - 1);

        }
        return fieldList.get(nextIndex);
    }


    @Override
    public String toString() {
        return "Board{" +
                "fieldList=" + fieldList +
                '}';
    }
}
