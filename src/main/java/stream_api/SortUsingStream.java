package stream_api;

import java.util.*;
import java.util.stream.Collectors;

public class SortUsingStream {

    public static void main(String[] args) {
        List<Employee> employees = getEmployees();

//        sorting employees based on salary
        List<Employee> sorted = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).toList();
        sorted.forEach(System.out::println);

//        max salary
        System.out.println("**************************************************");
        Employee maxSalary = employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
        System.out.println("max = " + maxSalary);

//        or  using mapToDouble but it return only the max value
        double maxx = employees.stream().mapToDouble(Employee::getSalary).max().getAsDouble();
        System.out.println(maxx);

//        sort based on department
        System.out.println("**************************************************");
        employees.stream().sorted(Comparator.comparing(Employee::getDepartment)).forEach(System.out::println);

//        check total cost
        System.out.println("**************************************************");
        double totalCost1 = employees.stream().mapToDouble(Employee::getSalary).sum();
        //        or
        double totalCost2 = employees.stream().map(Employee::getSalary).reduce(0.0, Double::sum);
        System.out.println("total cost = " + totalCost1 + "\n " + totalCost2);

//     filter all IT Employees
        System.out.println("************************Filter IT Dept****************************");
        employees.stream().filter(emp -> emp.getDepartment().equalsIgnoreCase("IT")).forEach(System.out::println);

//        get only names
        System.out.println("*************************Get Only Names***************************");
        employees.stream().map(Employee::getName).forEach(System.out::println);

//        count employees by dept
        System.out.println("*************************Count Employee by dept***************************");
        Map<String, Long> deptCount = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println("dep count = " + deptCount);

//        average salaary per dept
        System.out.println("*************************avg salary per dept***************************");
        Map<String, Double> avgSalary = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalary);

//        highest paid employee per dept
        System.out.println("************************highest salary per dept***************************");
        Map<String, Optional<Employee>> highSalary = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(highSalary);

//        sort based on two fields
        System.out.println("************************Sort based on Dept and salary***************************");
        employees.stream().sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getSalary)).forEach(System.out::println);

//      Find employees who joined after 2022
        System.out.println("************************employee who joined after 2022***************************");
        employees.stream().filter(emp -> emp.getDoj().compareTo("2022-01-01") > 0).forEach(System.out::println);

//        find the youngest employee
        System.out.println("************************youngest employee***************************");
        Employee young = employees.stream().max(Comparator.comparing(Employee::getDob)).orElseGet(null);
        System.out.println(young);

//        Salary statistics (min, max, average, sum, count)
        System.out.println("************************Salary statistics***************************");
        DoubleSummaryStatistics stats = employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(stats);
    }

    private static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Meghana", 45000, "IT", "2023-01-15", "2001-06-08"));
        employees.add(new Employee(2, "Harshith", 55000, "Finance", "2022-03-20", "1999-11-25"));
        employees.add(new Employee(3, "Sanketh", 60000, "HR", "2021-07-05", "1998-02-14"));
        employees.add(new Employee(4, "Saikumar", 70000, "IT", "2020-09-10", "1997-12-30"));
        employees.add(new Employee(5, "Prathyusha", 50000, "Marketing", "2023-06-01", "2000-04-19"));
        employees.add(new Employee(6, "Likith", 65000, "Operations", "2019-05-18", "1996-08-11"));
        employees.add(new Employee(7, "Mamata", 48000, "IT", "2021-11-22", "2001-03-07"));
        employees.add(new Employee(8, "Purushottam", 75000, "Finance", "2018-02-14", "1995-09-02"));
        employees.add(new Employee(9, "Maruthi", 52000, "Sales", "2022-04-09", "1999-05-23"));
        employees.add(new Employee(10, "Nisarga", 47000, "IT", "2023-08-19", "2000-12-15"));
        employees.add(new Employee(11, "Ravi", 80000, "Finance", "2017-06-27", "1994-01-19"));
        employees.add(new Employee(12, "Divya", 56000, "HR", "2020-03-30", "1998-07-22"));
        employees.add(new Employee(13, "Kiran", 51000, "Operations", "2021-09-12", "1997-10-05"));
        employees.add(new Employee(14, "Sneha", 62000, "Marketing", "2019-12-03", "1996-02-28"));
        employees.add(new Employee(15, "Anil", 58000, "Sales", "2022-10-15", "2000-06-10"));
        return employees;
    }
}
