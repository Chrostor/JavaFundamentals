package org.mentorshippdx.collect;

import java.util.HashSet;
import java.util.Set;


/**
 * Created by pierray on 1/23/2016.
 */
public class Setting {

    // One option (but not the only way):
    // Use an instance variable so it can be accessed later by other methods in the class.
    // Initialize it with a new (empty) set that's safe to mutate.
    //   (reminder to discuss immutable singleton values such as java.util.Collections#emptySet)
    //
    // note: in java 7+ the generic type is optional in "<>" on the right side of the "="
    private Set<String> wordsForRun = new HashSet<>();

    public void setUp() {
        wordsForRun.add("Hauling"); //#1
        wordsForRun.add("Sprinting");
        wordsForRun.add("Hauling"); //#2
        wordsForRun.add("Booking");
        wordsForRun.add("Running");
        wordsForRun.add("Smokin");
        wordsForRun.add("Burnin");
        wordsForRun.add("Hauling"); //#3

        // Alternative:  Build up and *return* a new Set each time this method is invoked.
        //               How would that change the code?
    }

    public Set<String> getWords() {
        return wordsForRun;
    }

    // overriding toString() for use with debugging and printing
    // e.g. toString() is automatically called in the following:
    //
    //   Setting setting = new Setting();
    //   System.out.println("setting is: " + setting); // <-- toString() invoked implicitly
    //
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Setting{ \n");

        // simple enhanced for-loop works fine for Sets
        for (String elem : wordsForRun) {
            sb.append("  ");
            sb.append(elem);
            sb.append('\n'); // discuss alternative:  use "fluent style" method chaining
        }
        sb.append('}');

        return sb.toString();
    }


    public String toStringSimple() {
        // delegate to the Set to perform its own toString() formatting
        return "Setting{ " + wordsForRun.toString() + " }";
    }


    // another example to show two ways of formatting as a String
    public static void main(String[] args) {
        Setting setting = new Setting();
        setting.setUp();

        System.out.println("Regular 'toString()':");
        System.out.println(setting); // .toString() implicitly called

        System.out.println("\n");
        System.out.println("Delegating to Set to handle own String representation:");
        System.out.println(setting.toStringSimple()); // explicit call of non-standard method

    }

}
