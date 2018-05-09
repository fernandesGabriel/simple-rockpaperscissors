package com.rockpaperscissors.model;

import java.util.ArrayList;
import java.util.Random;

public class Player {

    /**
     * Player's name
     */
    private String name;

    /**
     * Known rules
     */
    private ArrayList<Rule> rules = new ArrayList<Rule>();

    /**
     * Make Player alive
     *
     * @param name
     */
    public Player(String name) {

        this.name = name;

    }

    /**
     * Who am I? What I am doing here?
     *
     * @return String
     */
    public String whoIs() {

        return this.name;

    }

    /**
     * Getting to know the game
     *
     * @param rule
     */
    public void teachRule(Rule rule) {

        this.rules.add(rule);

    }

    /**
     * That is my best hand
     *
     * @return Rule
     */
    public Rule getHand() {

        Random randomizer = new Random();
        int index = randomizer.nextInt(this.rules.size());

        return this.rules.get(index);

    }

}
