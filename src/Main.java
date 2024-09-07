import dev.upico.domain.Employee;
import dev.upico.domain.EmployeeComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        List<Employee> employess = new ArrayList<>(List.of(
                new Employee(1739741,"Tejas",2019),
                new Employee(111111,"Xyz",2018),
                new Employee(1739742,"abc",2021),
                new Employee(1180596,"pqr",2022)
        ));

        var comparator = new EmployeeComparator<>();
        employess.sort(comparator);

        for(Employee e : employess){
            System.out.println(e);
        }
    }
}