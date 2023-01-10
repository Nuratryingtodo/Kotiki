

import java.util.HashMap;
public class Main {
    public static void main(String[] args) {

        HashMap<String, Cat> cats = new HashMap<String, Cat>();

        cats.put("Whiskers", new Cat("Whiskers", 2));
        cats.put("Simba", new Cat("Simba", 4));
        cats.put("Bella", new Cat("Bella", 1));
        cats.put("Lucy", new Cat("Lucy", 3));
        cats.put("Tiger", new Cat("Tiger", 5));
        cats.put("Oliver", new Cat("Oliver", 6));
        cats.put("Mittens", new Cat("Mittens", 7));
        cats.put("Fluffy", new Cat("Fluffy", 8));
        cats.put("Snowball", new Cat("Snowball", 9));
        cats.put("Shadow", new Cat("Shadow", 10));

        for (String key : cats.keySet()) {
            System.out.println(cats.get(key));
        }

        System.out.println("Size: " + cats.size());
        System.out.println("Is Simba in the list? " + cats.containsKey("Simba"));
        System.out.println("Is Luna in the list? " + cats.containsKey("Luna"));

        cats.remove("Fluffy");
        System.out.println("Size after removing Fluffy: " + cats.size());
        cats.clear();
        System.out.println("Size after clearing: " + cats.size());

    }
}