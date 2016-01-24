package org.mentorshippdx.collect;

import java.util.HashSet;
import java.util.Set;


/**
 * Created by pierray on 1/23/2016.
 */
public class Setting {
    public void setUp() {
        Set<String> wordsForRun = new HashSet<String>();
        wordsForRun.add("Hauling"); //#1
        wordsForRun.add("Sprinting");
        wordsForRun.add("Hauling"); //#2
        wordsForRun.add("Booking");
        wordsForRun.add("Running");
        wordsForRun.add("Smokin");
        wordsForRun.add("Burnin");
        wordsForRun.add("Hauling"); //#3
    }

}
