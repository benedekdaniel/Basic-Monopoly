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
    private static final int EXPECTED_BALANCE = 400;

    /** DICE roll as it is a constant dice atm it will
     * roll 6 every time, can be changed in game
     */


    @Before
    public void init() {
        carl = new Player(Token.COMPUTER);

        board = new Board();

        game = new Game(board, carl);

        carl.setLocation(board.getStartField());

    }


    @Test
    public void playGame() {

        game.playGame();

        assertEquals(carl.getLocation(), board.getFieldlist().get(6));

    }

    @Test
    public void crossingStartFieldWillGive200() {

        carl.setLocation(board.getFieldlist().get(38));

        game.playGame();

        assertEquals(carl.getBalance(), EXPECTED_BALANCE);

    }

    @Test
    public void crossingFieldsWorking() {

        //setting location to Mayfair and rolling 5

        carl.setLocation(board.getFieldlist().get(39));

        game.playGame();

        assertEquals(carl.getLocation(), board.getFieldlist().get(5));

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


        game.playGame();

        assertEquals(100, carl.getBalance());
    }

    @Test
    public void buyingPropertyAppendsPlayerPortfolio() {

        game.playGame();

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

        game = new Game(board, carl, helene);

        game.playGame();

        assertEquals(helene.getLocation(), carl.getLocation());

    }

}
