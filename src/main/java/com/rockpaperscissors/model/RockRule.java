package com.rockpaperscissors.model;

import java.util.ArrayList;

final public class RockRule extends Rule {

    /**
     * Handing you the championship
     *
     * @return ArrayList<Rule>
     */
    public ArrayList<Rule> getLosers() {

        ArrayList<Rule> losers = new ArrayList<Rule>();

        losers.add(new ScissorsRule());

        return losers;

    }

}
