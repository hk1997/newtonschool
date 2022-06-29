package oops.staticMembers;

public class Employee {

    private static int objectCount;
    private long employeeId;
    private String name;

    public Employee(long employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
        objectCount++;
    }

    public static int getObjectCount() {
        return objectCount;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }
}
