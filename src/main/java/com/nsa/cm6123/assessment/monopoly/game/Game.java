package com.nsa.cm6123.assessment.monopoly.game;

import com.nsa.cm6123.assessment.monopoly.board.Board;
import com.nsa.cm6123.assessment.monopoly.player.Player;

import java.util.Arrays;
import java.util.List;

public class Game {

    List<Player> players;
    Board theBoard;

    public Game(Board theBoard, Player... somePlayers) {
        this.theBoard = theBoard;


        players = Arrays.asList(somePlayers);

        for (Player aPlayer : players) {
            aPlayer.setLocation(theBoard.getStartField());
        }
    }

    public void playGame(){


        int currentPlayerIdx=0;
        Player currentPlayer = players.get(currentPlayerIdx);



        takeTurn(currentPlayer, theBoard);

        currentPlayerIdx++;
        if (currentPlayerIdx == players.size()){
            currentPlayerIdx=0;
        }


    }

    private void takeTurn(Player currentPlayer, Board theBoard) {
        int diceRoll=3;
        currentPlayer.setLocation(theBoard.moveTo(currentPlayer.getLocation(), diceRoll));

    }
}
