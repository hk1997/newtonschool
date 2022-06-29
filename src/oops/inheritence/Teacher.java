package oops.inheritence;

import java.util.List;

public class Teacher extends Employee{

    private List<String> subjects;
    private List<Integer> classes;

    public Teacher(long employeeId, String name, List<String> subjects, List<Integer> classes) {
        super(employeeId, name);
        this.subjects = subjects;
        this.classes = classes;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public List<Integer> getClasses() {
        return classes;
    }
}
