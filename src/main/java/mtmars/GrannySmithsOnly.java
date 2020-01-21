package mtmars;

import java.util.function.Predicate;

public class GrannySmithsOnly<T> implements Predicate<T> {

    private AppleType desiredType = AppleType.GRANNY_SMITH;

    public boolean test(T t) {

        if(t.getClass() != Apple.class){
            return false;
        } else {
            Apple apple = (Apple) t;
            return apple.getType() == desiredType;
        }


    }
}
