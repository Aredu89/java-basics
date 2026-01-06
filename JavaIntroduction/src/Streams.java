import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Eric", "Melissa", "Elijah", "Milo", "Adil");

        List<String> result = names.stream()
                .filter(s -> s.length() <= 6)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        result.forEach(System.out::println);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Eric", 8));
        employees.add(new Employee(2, "Milo", 5));
        employees.add(new Employee(3, "Melissa", 12));
        employees.add(new Employee(4, "Elijah", 1));
        employees.add(new Employee(5, "Adil", 24));
        employees.add(new Employee(6, "Enrique", 1));
        employees.add(new Employee(7, "Chad", 18));

        long employeeYearsAboveTen = employees.stream()
                .filter(e -> e.getYearsOfService() > 10)
                .count();
        System.out.println(employeeYearsAboveTen);

        List<Employee> namesStartWithE = employees.stream()
                .filter(e -> e.getFirstName().startsWith("E"))
                .toList();
        namesStartWithE.forEach(e -> System.out.println(e.getFirstName()));
    }
}
