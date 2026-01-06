import java.util.function.Function;

public class MethodReferencing {
    public static void main(String[] args) {
        Function<String, Integer> countVowelsFunction = Vowels::countVowels;
        System.out.println(countVowelsFunction.apply("Umbrella"));
    }
}
