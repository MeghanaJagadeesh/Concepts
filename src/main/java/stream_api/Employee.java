package stream_api;


public class Employee {

    private int id;
    private String name;
    private double salary;
    private String department;
    private String doj;
    private String dob;

    public Employee(int id, String name, double salary, String department, String doj, String dob) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.doj = doj;
        this.dob = dob;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", doj='" + doj + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
