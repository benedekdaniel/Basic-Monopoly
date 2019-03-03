package com.nsa.cm6123.assessment.monopoly.game;

import com.nsa.cm6123.assessment.monopoly.board.Board;
import com.nsa.cm6123.assessment.monopoly.player.Player;
import com.nsa.cm6123.assessment.monopoly.player.Token;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    private Board board;
    private Game game;
    private Player carl;
    private static final long EXPECTED_MONEY = 400L;
    private static final long EXPECTED_BALANCE2 = 100L;
    private static final long ORIGINAL_BALANCE = 200L;




    /* DICE roll as it is a constant dice atm it will
     * roll 5 every time which not a property, can be changed in game
     * If player stands on a property, he buys it.
     */


    @Before
    public void constructGame() {
        carl = new Player(Token.CAR, ORIGINAL_BALANCE);

        board = new Board();

        game = new Game(board, carl);

        carl.setLocation(board.getStartField());

        game.playGame();

    }


    @Test
    public void playGame() {


        assertEquals(board.getFieldlist().get(6), carl.getLocation());

    }


    @Test
    public void crossingFieldsWorking() {

        //setting location to Super Tax(38) and rolling 5

        Player patricia = new Player(Token.GLOBE);

        Board newBoard = new Board();

        Game newGame = new Game(newBoard, patricia);


        patricia.setLocation(newBoard.getFieldlist().get(38));

        newGame.playGame();

        assertEquals(newBoard.getFieldlist().get(3), patricia.getLocation());



    }

    @Test
    public void makeSurePlayersIsInPlayersList() {

        assertTrue(game.getPlayers().contains(carl));
    }

    @Test
    public void gettingTheBoardWorks() {

        assertEquals(game.getTheBoard().getFieldlist(), board.getFieldlist());
    }

    @Test
    public void gettingThePlayerListWorking() {

        assertEquals(carl, game.getPlayers().get(0));
    }

    @Test
    public void buyingPropertyReducesBalance() {

        carl.setLocation(board.getFieldlist().get(1));


        assertEquals(EXPECTED_BALANCE2, carl.getBalance());
    }

    @Test
    public void buyingPropertyAppendsPlayerPortfolio() {


        assertTrue(carl.getPlayerPortfolio().size() > 0);
    }

    @Test
    public void multiplePlayersRollingAndMoving() {

       Player helene = new Player(Token.BICYCLE);

       helene.setLocation(board.getStartField());

       game = new Game(board, carl, helene);

       game.playGame();

       assertTrue(helene.getLocation().getIndex() > 0 &&
               carl.getLocation().getIndex() > 0);

       //They are moving around the board

    }

    @Test
    public void twoPlayersStandingOnSameField() {

        Player helene = new Player(Token.BICYCLE);

        helene.setLocation(board.getStartField());

        carl.setLocation(board.getStartField());

        game = new Game(board, carl, helene);

        game.playGame();

        assertEquals(helene.getLocation(), carl.getLocation());

    }

}
