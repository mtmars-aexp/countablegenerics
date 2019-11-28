package mtmars;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Countable> implements Countable {

    //A box can hold anything that implements the Countable interface.
    private List<T> contents = new ArrayList<T>();


    //Boxes will return the amount of items inside them.
    public int getCount() {
        return contents.size();
    }

    //You can add an item to the box, such as apples.
    public void add(T item) {
        contents.add(item);
    }
}
