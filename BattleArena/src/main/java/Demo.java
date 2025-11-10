import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        // Add our code here
        var message = "Hello World";
        String extra = "of Java!";
        System.out.println(message + " " + extra);
        System.out.println("Favorite Color: Blue");
        System.out.println("Hobby: Coding");

        // HashSets
        var books = new HashSet<>(List.of("Book 0"));
        books.add("Book 1");
        books.add("Book 2");
        books.add("Book 3");

        books.remove("Book 2");
        System.out.println(books.contains("Book 3"));

        for (String book: books) {
            System.out.println(book);
        }

        // Deques
        var cards = new ArrayDeque<>();
        cards.add("King");
        cards.add("Queen");
        cards.addFirst("Ace");
        cards.addLast("Jack");

        System.out.println(cards);
        System.out.println(cards.peekFirst());
        System.out.println(cards.contains("Eric"));

        cards.removeFirst();
        System.out.println(cards);

        // HashMaps
        var states = new HashMap<String, String>();
        states.put("California", "CA");
        states.put("New York", "NY");
        states.put("Texas", "TX");
        states.put("Ohio", "OH");
        states.putIfAbsent("Ohio", "OH");
        states.putIfAbsent("Washington", "WS");
        states.replace("Washington", "WA");

        System.out.println(states);
        System.out.println(states.get("New York"));
        System.out.println(states.containsKey("Washington"));
        System.out.println(states.containsValue("Washington"));
    }

}
