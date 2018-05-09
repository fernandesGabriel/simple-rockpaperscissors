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
    public ArrayList<Player> whoWins() {

        ArrayList<Player> winners = this.players;

        if (this.players.get(0).getHand().doesBeat(this.players.get(1).getHand())) {

            winners = new ArrayList<Player>();
            winners.add(this.players.get(0));

        } else if (this.players.get(1).getHand().doesBeat(this.players.get(0).getHand())) {

            winners = new ArrayList<Player>();
            winners.add(this.players.get(1));

        }

        // todo: need to implement feature to process multiple (more than 2) players

        return winners;

    }

    /**
     * Who are they?
     *
     * @return ArrayList<Player>
     */
    public ArrayList<Player> getPlayers() {

        return this.players;

    }

}
