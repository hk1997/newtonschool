package oops.staticMembers;

public class TestEmployeeClass {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Hardik");
        Employee e2 = new Employee(2,"Kartik");
        System.out.println(Employee.getObjectCount());
        Employee e3 = new Employee(3,"Vrinda");
        System.out.println(Employee.getObjectCount());
    }
}
