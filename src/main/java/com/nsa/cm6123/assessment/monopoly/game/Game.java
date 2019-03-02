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

    public Game(final Board theBoard, final Player... somePlayers) {
        this.theBoard = theBoard;


        players = Arrays.asList(somePlayers);

        for (Player aPlayer : players) {
            aPlayer.setLocation(theBoard.getStartField());
        }
    }

    public void playGame() {


        int currentPlayerIdx = 0;
        Player currentPlayer = players.get(currentPlayerIdx);



        takeTurn(currentPlayer, theBoard);

        currentPlayerIdx++;
        if (currentPlayerIdx == players.size()) {
            currentPlayerIdx = 0;
        }


    }



    private void takeTurn(final Player currentPlayer, final Board theBoard) {

        IDice dice = new ConstantDice(ROLLING);

        currentPlayer.setLocation(theBoard.moveTo(currentPlayer
                .getLocation(), dice.diceRoll()));

        if ( wentFullCircle(currentPlayer, dice.diceRoll())) {
            currentPlayer.setBalance(currentPlayer.getBalance() + INCREASE_BALANCE);
        }

    }

    private boolean wentFullCircle(final Player currentPlayer, final int dice) {
            return ((currentPlayer.getLocation().getIndex() - dice) < 0);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Board getTheBoard() {
        return theBoard;
    }
}
