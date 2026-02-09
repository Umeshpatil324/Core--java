package Encapsulation;

class Employee {
    private final int empId;   // cannot be changed
    private String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public int getEmpId() {    // No setter → read-only
        return empId;
    }

    public String getName() {
        return name;
    }
}


