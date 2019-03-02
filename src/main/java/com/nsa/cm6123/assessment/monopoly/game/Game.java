package com.nsa.cm6123.assessment.monopoly.game;

import com.nsa.cm6123.assessment.monopoly.board.Board;
import com.nsa.cm6123.assessment.monopoly.player.Player;

import java.util.Arrays;
import java.util.List;

public class Game {

    private List<Player> players;
    private Board theBoard;
    private static final int ROLLING = 5;
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
        Player currentPlayer = players.get(currentPlayerIdx);

        takeTurn(currentPlayer, theBoard);

        currentPlayerIdx++;

        //If all players took their turn next player is
        //first player
        if (currentPlayerIdx == players.size()) {
            currentPlayerIdx = 0;
        }

    }


    private void takeTurn(final Player currentPlayer, final Board aBoard) {

        IDice dice = new ConstantDice(ROLLING);

        //Moving the player around with the moveto function
        currentPlayer.setLocation(aBoard.moveTo(currentPlayer
                .getLocation(), dice.diceRoll()));


        //Increasing balance by 200 when crossing start field
        if (wentFullCircle(currentPlayer, dice.diceRoll())) {
            currentPlayer.setBalance(currentPlayer
                    .getBalance() + INCREASE_BALANCE);
        }

    }

    private boolean wentFullCircle(final Player currentPlayer, final int dice) {

            //Checking whether the player just crossed the start field
            //Or not by subtracting the dice number from his currentLoc
            return ((currentPlayer.getLocation().getIndex() - dice) < 0);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Board getTheBoard() {
        return theBoard;
    }
}
