import java.util.ArrayList;
import java.util.List;

public class LambdasIntroduction {
    public static void main(String[] args) {
        Greetings lambda = (n) -> System.out.println(n);
        lambda.greetings("Hello java!");
    }
}

@FunctionalInterface
interface Greetings {
    void greetings(String greeting);
}
