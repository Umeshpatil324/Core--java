package Encapsulation;

 public class Student {
    private int rollNo;   // private data
    private String name;

    // setter methods
    public void setRollNo(int r) {
        rollNo = r;
    }

    public void setName(String n) {
        name = n;
    }

    // getter methods
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
}


