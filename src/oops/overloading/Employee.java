package oops.overloading;

import java.util.Date;

/**
 * Example for constructor overloading
 */
public class Employee {
    private long employeeId;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String department;
    private Date joiningDate;
    private String phoneNumber;

    /**
     * My use case is to create employees when:
     * 1. We have only employeeId
     * 2. We have employeeId, firstname,
     * 3. We have employeeId, firstName, lastName
     */
    public Employee(long eid){
        employeeId = eid;
    }

    // Overloaded constructor
    public Employee(long eid, String fName){
        employeeId = eid;
        firstName = fName;
    }

    // Overloaded constructor
    public Employee(long eid, String fName, String lName){
        employeeId = eid;
        firstName = fName;
        lastName = lName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getEmployeeId() {
        return employeeId;
    }
}
