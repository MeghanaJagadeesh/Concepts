package Compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(2, "mno", 200));
        employees.add(new Employee(3, "pqr", 300));
        employees.add(new Employee(1, "abc", 100));

        for (Employee e : employees) {
            System.out.println(e);
        }

        Collections.sort(employees); // this will call compareTo()
        //  Collections.sort(employees, new EmployeOverview()); //this will call compare()

        System.out.println("***************************");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
