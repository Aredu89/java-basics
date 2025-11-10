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
    }

}
