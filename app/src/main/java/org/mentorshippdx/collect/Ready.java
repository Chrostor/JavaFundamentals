package org.mentorshippdx.collect;


/**
 * Created by pierray on 1/23/2016.
 */
public class Ready {

    public void printIt(Setting bookIt) {
        // Note: letting Ready have intimate knowledge and access to the underlying
        //       data in Setting can be questionable.  It's fine for this example but understand
        //       it raises a flag about concerns of coupling.

        // Sets are collections making them easy to iterate over with enhanced for loop
        for (String word : bookIt.getWords()) {
            System.out.println("  " + word);
        }

        // Alternative: let the instance format itself by use of its own toString()
        //System.out.println("Setting is: " + bookIt); // bookIt.toString() implicitly called
    }
}

