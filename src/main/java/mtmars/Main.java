package mtmars;

public class Main {

    public static void main(String args[]){

        Apple apple = new Apple();
        Box box = new Box();
        Box otherBox = new Box();
        Cart cart = new Cart();
        Counter appleCounter = new Counter();
        Counter boxCounter = new Counter();
        Counter cartCounter = new Counter();

        //Adding apples to the apple counter.
        appleCounter.add(apple);
        appleCounter.add(apple);
        appleCounter.add(apple);
        appleCounter.add(apple);

        //Adding boxes to the box counter.
        boxCounter.add(box);
        boxCounter.add(box);
        boxCounter.add(box);

        //Adding carts to the cart counter.
        cartCounter.add(cart);
        cartCounter.add(cart);

        System.out.println(appleCounter.getCount()); //Should print 4.
        System.out.println(boxCounter.getCount()); //Should print 0. No apples in the boxes.
        System.out.println(cartCounter.getCount()); //Should print 2. No apples in the boxes in the carts.

        otherBox.add(apple);
        cart.add(otherBox);

        System.out.println(cartCounter.getCount()); //Should print 2. With two identical carts in the counter, and 1 box of apples in each, that's 2 apples in total.


        box.add(apple);
        System.out.println(box.getCount()); //Should print 1.
        box.add(apple);
        System.out.println(box.getCount()); //Should print 2.

        cart.add(box);
        cart.add(box);
        System.out.println(cart.getCount()); //Should print 4, as each box has 2 apples each, and there's 2 boxes.
        cart.add(box);
        System.out.println(cart.getCount()); //Should now print 6. Another box of 2 apples has been added.
    }

}
