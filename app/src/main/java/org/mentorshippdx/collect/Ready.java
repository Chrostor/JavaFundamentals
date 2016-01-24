package org.mentorshippdx.collect;

import java.util.Iterator;

/**
 * Created by pierray on 1/23/2016.
 */
public class Ready {
    Setting bookIt = new Setting();

    public void printIt(){
        Iterator iterator = new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }

            @Override
            public void remove() {

            }
        };
        while(iterator.hasNext()){
            System.out.println(bookIt);
        }




        }
    }

