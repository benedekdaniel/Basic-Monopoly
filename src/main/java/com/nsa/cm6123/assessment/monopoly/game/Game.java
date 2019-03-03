package com.nsa.cm6123.assessment.monopoly.game;

import com.nsa.cm6123.assessment.monopoly.board.Board;
import com.nsa.cm6123.assessment.monopoly.board.Field;
import com.nsa.cm6123.assessment.monopoly.board.Property;
import com.nsa.cm6123.assessment.monopoly.player.Player;

import java.util.Arrays;
import java.util.List;

public class Game {

    private List<Player> players;
    private Board theBoard;
    private static final int ROLLING = 6;
    private static final int INCREASE_BALANCE = 200;

    Game(final Board aBoard, final Player... somePlayers) {
        this.theBoard = aBoard;


        players = Arrays.asList(somePlayers);

        //Putting all players in a list and setting
        //starting field to Go

        for (Player aPlayer : players) {
            aPlayer.setLocation(theBoard.getStartField());
        }
    }

    public void playGame() {


        //getting first player and taking turn

        int currentPlayerIdx = 0;

        while (currentPlayerIdx != players.size()) {
            Player currentPlayer = players.get(currentPlayerIdx);

            takeTurn(currentPlayer, theBoard);

            currentPlayerIdx++;

            //If all players took their turn
            //the game terminates
            }


        }




    private void takeTurn(final Player currentPlayer, final Board aBoard) {

        //Can be changed any time to the original 2 dice
        IDice dice = new ConstantDice(ROLLING);

        //Moving the player around with the moveto function
        currentPlayer.setLocation(aBoard.moveTo(currentPlayer
                .getLocation(), dice.diceRoll()));

        buyProperty(currentPlayer, currentPlayer.getLocation());


        //Increasing balance by 200 when crossing start field
        if (wentFullCircle(currentPlayer, dice.diceRoll())) {
            currentPlayer.setBalance(currentPlayer
                    .getBalance() + INCREASE_BALANCE);
        }

    }

    private boolean wentFullCircle(final Player currentPlayer
            , final int aDice) {

        //Checking whether the player just crossed the start field
        //Or not by subtracting the dice number from his currentLoc
        return ((currentPlayer.getLocation().getIndex() - aDice) < 0);
    }

    private void buyProperty(final Player currentplayer, final Field field) {

        final boolean buy = true;

        /*If Player moves on Property field this will allows
          to buy it. For further development the buy "button"
          can be turned on and placed into if statement
        */

        if (currentplayer.getLocation() instanceof Property) {
            currentplayer.setBalance(currentplayer
                    .getBalance() - field.getPrice());
        }
        currentplayer.getPlayerPortfolio().add(field);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Board getTheBoard() {
        return theBoard;
    }
}
