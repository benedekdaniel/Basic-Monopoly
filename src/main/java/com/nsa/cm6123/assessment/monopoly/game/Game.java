package com.nsa.cm6123.assessment.monopoly.game;

import com.nsa.cm6123.assessment.monopoly.board.Board;
import com.nsa.cm6123.assessment.monopoly.player.Player;

import java.util.Arrays;
import java.util.List;

public class Game {

    private List<Player> players;
    private Board theBoard;
    private static final int ROLLING = 3;
    private static final int INCREASE_BALANCE = 200;

    public Game(final Board aBoard, final Player... somePlayers) {
        this.theBoard = aBoard;


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



    private void takeTurn(final Player currentPlayer, final Board aBoard) {

        IDice dice = new ConstantDice(ROLLING);

        currentPlayer.setLocation(aBoard.moveTo(currentPlayer
                .getLocation(), dice.diceRoll()));

        if ( wentFullCircle(currentPlayer, dice.diceRoll())) {
            currentPlayer.setBalance(currentPlayer.getBalance() + 200);
        }

    }

    private boolean wentFullCircle(final Player currentPlayer, final int dice) {
            return ((currentPlayer.getLocation().getIndex() - dice) < 0);
    }

}
