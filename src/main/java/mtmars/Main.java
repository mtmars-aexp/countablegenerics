package mtmars;

import java.util.function.Predicate;

public class Main {

    public static void main(String args[]){

        Apple apple1 = new Apple(AppleType.BRAEBURN);
        Apple apple2 = new Apple(AppleType.GRANNY_SMITH);
        Apple apple3 = new Apple(AppleType.BRAEBURN);
        Apple apple4 = new Apple(AppleType.GRANNY_SMITH);
        Apple apple5 = new Apple(AppleType.BRAEBURN);
        Apple apple6 = new Apple(AppleType.GOLDEN_DELICIOUS);

        Counter<Apple> braeburnCounter = new Counter<Apple>(new BraeburnsOnly());
        Counter<Apple> grannySmithCounter = new Counter<Apple>(new GrannySmithsOnly());
        Counter<Apple> lambdaBraeburnCounter = new Counter<Apple>(o -> o.getType() == AppleType.BRAEBURN);
        Counter<Apple> goldenDeliciousCounter = new Counter<Apple>(o -> o.getType() == AppleType.GOLDEN_DELICIOUS);



        braeburnCounter.add(apple1);
        braeburnCounter.add(apple2);
        braeburnCounter.add(apple3);
        braeburnCounter.add(apple6);
        grannySmithCounter.add(apple1);
        grannySmithCounter.add(apple2);
        lambdaBraeburnCounter.add(apple1);
        lambdaBraeburnCounter.add(apple2);
        goldenDeliciousCounter.add(apple4);
        goldenDeliciousCounter.add(apple5);
        goldenDeliciousCounter.add(apple6);
        goldenDeliciousCounter.add(apple6);
        goldenDeliciousCounter.add(apple6);
        goldenDeliciousCounter.add(apple6);
        goldenDeliciousCounter.add(apple6);
        goldenDeliciousCounter.add(apple6);

        System.out.println(braeburnCounter.getCount());
        System.out.println(grannySmithCounter.getCount());
        System.out.println(goldenDeliciousCounter.getCount());
        System.out.println(lambdaBraeburnCounter.getCount());


    }

}
