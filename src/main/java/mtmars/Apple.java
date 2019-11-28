package mtmars;

public class Apple implements Countable {

    public int value = 1;

    //Apples always return 1 (themselves).
    public int getCount() {
        return value;
    }

    //You cannot add something to an apple.

}
