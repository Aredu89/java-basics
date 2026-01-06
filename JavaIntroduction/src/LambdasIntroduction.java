import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdasIntroduction {
    public static void main(String[] args) {
        Greetings lambda = (n) -> System.out.println(n);
        lambda.greetings("Hello java!");

        StringEndings exclamationMark = (s) -> s + "!";
        System.out.println(exclamationMark.perform("Hello"));

        String a = "Ariel";
        String b = "Developer";

        StringCompare value = (s1, s2) -> {
            if(s1.length() > s2.length()) {
                return s1;
            }
            return s2;
        };

        String longerWord = value.perform(a, b);
        System.out.println(longerWord);

        Predicate<Integer> lessThan100 = i -> (i<100);
        Predicate<Integer> greaterThan50 = i -> (i>50);

        boolean result = lessThan100.and(greaterThan50).test(55);
        System.out.println(result);

        Calculate divide = (a1,b2) -> {
            try {
                return a1 / b2;
            } catch (ArithmeticException e) {
                e.printStackTrace();
                return -1;
            }
        };
        int solution = divide.perform(10,2);
        System.out.println(solution);
    }
}

@FunctionalInterface
interface Greetings {
    void greetings(String greeting);
}

@FunctionalInterface
interface StringEndings {
    String perform(String s);
}

@FunctionalInterface
interface StringCompare {
    String perform (String s1, String s2);
}

@FunctionalInterface
interface Calculate {
    int perform(int a, int b);
}
