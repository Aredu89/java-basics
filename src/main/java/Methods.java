public class Methods {
    public static void main(String[] args) {
        helloWorld(3);
    }

    //Overload method
    static void helloWorld(int count) {
        for(int i=1; i <= count; i++) {
            helloWorld();
        };
    };

    static void helloWorld() {
        System.out.println("Hello World");
        System.out.println("Welcome to Java!");
    };
}
