import java.util.ArrayList;
import java.util.List;

public class LambdasIntroduction {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Edgar");
        names.add("Ariel");
        names.add("Enzo");
        names.add("Ivan");
        names.add("Lucas");
        names.add("Joaquin");
        names.add("David");

        names.forEach((n) -> System.out.println(n));
    }
}
