package oops.inheritence;

public class Employee {
    private long employeeId;
    private String name;

    public Employee(long employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }
}
