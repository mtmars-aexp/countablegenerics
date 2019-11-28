package mtmars;

import java.util.ArrayList;
import java.util.List;

public class Counter<T extends Countable> implements Countable {

    //A counter counts anything countable. That sounds obvious when I write it out like this.
    private List<T> counterList = new ArrayList<T>();


    //Counters will return a count by looping through each item in the list and calling the getCount method.
    public int getCount() {

        int total = 0;

        for(T item: counterList){
            total += item.getCount();
        }

        return total;
    }

    //You can add anything to the counter.
    void add (T item){
        counterList.add(item);
    }

}
