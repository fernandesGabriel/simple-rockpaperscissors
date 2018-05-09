package com.rockpaperscissors.model;

import java.util.ArrayList;

abstract class Rule implements Winnerable {

    /**
     * Checks who I can beat
     *
     * @param competitor
     * @return boolean
     */
    public boolean doesBeat(Rule competitor) {

        ArrayList<Rule> looserRules = this.getLosers();

        for (Rule rule : looserRules) {

            if (!competitor.getClass().equals(rule.getClass())) return false;

        }

        return true;

    }

}
