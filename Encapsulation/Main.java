package Encapsulation;

public class Main {
	public static void main(String[] args) {
		Student s = new Student();
		s.setRollNo(101);
		s.setName("Umesh");

		System.out.println(s.getRollNo());
		System.out.println(s.getName());
		
		BankAccount acc = new BankAccount();
        acc.setBalance(5000);
        System.out.println("Balance: " + acc.getBalance());
        
        Employee e = new Employee(1, "Rahul");
        System.out.println(e.getEmpId());
        System.out.println(e.getName());
	}
}
