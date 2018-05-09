package com.rockpaperscissors.model;

import java.util.ArrayList;

public class Game {

    /**
     * Game Players
     */
    private ArrayList<Player> players = new ArrayList<Player>();

    /**
     * Adding player to the gang
     *
     * @param player
     */
    public void addPlayer(Player player) {

        this.players.add(player);

    }

    /**
     * Claiming the winner
     *
     * @return Player
     */
    public Player whoWins() {

        // todo: implement logic to see who wins with each picked hand

        return new Player("winner (for now)");

    }

}
