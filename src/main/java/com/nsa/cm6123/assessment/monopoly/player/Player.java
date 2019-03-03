package com.nsa.cm6123.assessment.monopoly.player;

import com.nsa.cm6123.assessment.monopoly.board.Field;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.LogManager;
import java.util.logging.Logger;



public class Player {

    private static Logger LOGGER = null;

    static {

        //replace Player with the name of the class
        InputStream stream = Player.class.getClassLoader()
                .getResourceAsStream("logging.properties");
        try {
            LogManager.getLogManager().readConfiguration(stream);
            //replace Player with the name of the class
            LOGGER = Logger.getLogger(Player.class.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Token token;
    private long balance;
    private Field location;

    private static final long STARTING_BALANCE = 200L;

    private ArrayList<Field> playerPortfolio;


    public Player(final Token aToken, final long aBalance) {
        this.token = aToken;
        this.balance = aBalance;
        playerPortfolio = new ArrayList<Field>();

        LOGGER.info("Player created: Token = "
                + token + ", aBalance = " + balance);
    }


    public Player(final Token aToken) {

        this(aToken, STARTING_BALANCE);
    }

    public Player() {
        this(Token.COMPUTER);
    }

    public Token getToken() {
        return token;
    }

    public void setToken(final Token aToken) {
        this.token = aToken;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(final long aBalance) {
        this.balance = aBalance;
    }

    public Field getLocation() {
        return location;
    }

    public void setLocation(final Field aLocation) {
        this.location = aLocation;
    }

    public ArrayList<Field> getPlayerPortfolio() {
        return playerPortfolio;
    }

    @Override
    public String toString() {
        return "Player{" +
                "token='" + token + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return balance == player.balance &&
                Objects.equals(token, player.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, balance);
    }
}
