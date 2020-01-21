package mtmars;

public class Apple implements Countable {

    private int value = 1;
    private AppleType type;

    public Apple(AppleType type){
        this.type = type;
    }

    //Apples always return 1 (themselves).
    public int getCount() {
        return value;
    }

    //You cannot add something to an apple.

    public AppleType getType(){
        return type;
    }

}
