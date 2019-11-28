package mtmars;

import java.util.ArrayList;
import java.util.List;

public class Cart implements Countable {

    //Carts carry boxes.
    private List<Box> cargo = new ArrayList<Box>();

    //Carts return the count of apples in every box they carry.
    public int getCount() {

        int count = 0;

        for (Box box : cargo){
            count += box.getCount();
        }

        return count;
    }

    //Carts can only add boxes.
    public void add(Box box) {
        cargo.add(box);
    }
}
