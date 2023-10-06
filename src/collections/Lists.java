package collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        List fruits = new ArrayList();

        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("berry");

        fruits.set(2, "grape");
        fruits.add("lemon");

        System.out.println(fruits);
        System.out.println("length " + fruits.size());
        System.out.println(fruits.get(fruits.size() - 1));
        System.out.println(fruits.indexOf("lemon"));
        System.out.println(fruits.lastIndexOf("lemon"));

        fruits.remove("lemon");
        fruits.remove(3);

        System.out.println(fruits);



    }
}