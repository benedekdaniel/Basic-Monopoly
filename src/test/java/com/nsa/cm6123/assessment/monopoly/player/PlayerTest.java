package com.nsa.cm6123.assessment.monopoly.player;

import com.nsa.cm6123.assessment.monopoly.board.Board;
import com.nsa.cm6123.assessment.monopoly.player.Player;
import com.nsa.cm6123.assessment.monopoly.player.Token;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    private Player computer;
    private static final long EXPECTED_BALANCE = 200L;


    @Before
    public void constructTopHatPlayer() {
        computer = new Player();

    }

    @Test
    public void playerShouldStartWith200Dollars() throws Exception {
        assertEquals(EXPECTED_BALANCE, computer.getBalance());
    }

    @Test
    public void getToken() {
        assertEquals(Token.COMPUTER, computer.getToken());
    }

    @Test
    public void setToken() {
        computer.setToken(Token.BICYCLE);
        assertEquals(Token.BICYCLE, computer.getToken());


    }

    @Test
    public void getBalance() {
        assertEquals(EXPECTED_BALANCE, computer.getBalance());

    }

    @Test
    public void setBalance() {
//        final long half = 100L;
        computer.setBalance(100L);
//        assertEquals(half, topHat.getBalance());

        assertEquals(100L, computer.getBalance());

    }

    @Test
    public void setAndGetLocation() {

        Board board = new Board();

        computer.setLocation(board.getStartField());

        assertEquals(computer.getLocation(), board.getStartField());
    }


    @Test
    public void toStringEquals() {
        String expectedObject = "Player{" +
                "token='" + "COMPUTER" + '\'' +
                ", balance=" + EXPECTED_BALANCE +
                '}';
        assertEquals(expectedObject, computer.toString());
    }

    @Test
    public void tokensAreEqual() {
        Player computer2 = new Player(Token.COMPUTER);
        assertEquals(computer, computer2);
    }

    @Test
    public void tokensHashCode() {
        Player computer2 = new Player(Token.COMPUTER);
        assertEquals(computer.hashCode(), computer2.hashCode());
    }
}
