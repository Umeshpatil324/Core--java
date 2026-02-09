package Class_Object;

 public class Calculator {

    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    public static void main(String[] args) {
        Calculator c = new Calculator(); // Object
        c.add(10, 20);
    }
}

