import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Ayushi", "IT", 70000, true),
                new Employee(2, "Rahul", "HR", 50000, false),
                new Employee(3, "Neha", "IT", 90000, true),
                new Employee(4, "Amit", "Finance", 60000, true),
                new Employee(5, "Sneha", "HR", 80000, false)
        );

        // 1. Salary > 60000
        System.out.println("Employees with salary > 60000:");
        employees.stream()
                .filter(e -> e.getSalary() > 60000)
                .forEach(System.out::println);

        // 2. Names to uppercase
        System.out.println("\nNames in uppercase:");
        employees.stream()
                .map(e -> e.getName().toUpperCase())
                .forEach(System.out::println);

        // 3. Sort by salary descending
        System.out.println("\nSorted by salary descending:");
        employees.stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(System.out::println);

        // 4. Count active employees
        long activeCount = employees.stream()
                .filter(Employee::isActiveStatus)
                .count();
        System.out.println("\nActive Employees Count: " + activeCount);

        // 5. Group by department
        System.out.println("\nGrouped by department:");
        Map<String, List<Employee>> grouped = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        grouped.forEach((dept, empList) -> {
            System.out.println(dept + " -> " + empList);
        });

        // 6. Highest salary employee
        Employee highest = employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .get();
        System.out.println("\nHighest Salary Employee: " + highest);

        // 7. Second highest salary
        Employee secondHighest = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .get();
        System.out.println("Second Highest Salary Employee: " + secondHighest);
    }
}
