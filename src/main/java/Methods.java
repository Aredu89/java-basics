public class Methods {
    public static void main(String[] args) {
        String printedMessage = helloWorld(3);
        System.out.println(printedMessage);
    }

    //Overload method
    static String helloWorld(int count) {
        for(int i=1; i <= count; i++) {
            helloWorld();
        };

        return "Message printed " + count + " times";
    };

    static void helloWorld() {
        System.out.println("Hello World");
        System.out.println("Welcome to Java!");
    };
}
