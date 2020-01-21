package mtmars;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Counter<T extends Countable> implements Countable{

    //A counter counts anything countable. That sounds obvious when I write it out like this.
    private List<T> counterList = new ArrayList<>();

    //Counters will return a count by looping through each item in the list and calling the getCount method.

    private Predicate predicate;

    public Counter(Predicate<T> predicate){
        this.predicate = predicate;
    }

    public int getCount() {
        //Modify Counter<T> so that it uses a predicate to decide whether an object should be counted or not.

        int total = 0;

        for(T item: counterList){
            if(predicate.test(item)){
                total += item.getCount();
            }
        }

        return total;
    }

    //You can add anything to the counter.
    void add (T item){
        counterList.add(item);
    }

}
