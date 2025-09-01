package Compare;

import java.util.Comparator;

public class EmployeOverview implements Comparator<Employee> {
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return o1.getId() > o2.getId() ? 1 : -1;
//    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
