package collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
        Set fruits = new HashSet();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("apple");

        System.out.println(fruits);
        System.out.println("Have Lemon " + fruits.contains("lemon") );

        System.out.println("Size "+ fruits.size());
        fruits.remove("lemon");
        System.out.println("Size "+ fruits.size());

        Set moreFruits = Set.of("apple", "banana", "resin", "mango" );
        moreFruits.add("kiwi");
        moreFruits.remove("resin");
        System.out.println(moreFruits);
    }
}
