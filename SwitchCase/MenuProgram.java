package SwitchCase;

public class MenuProgram {
	public static void main(String[] args) {
        int choice = 2;

        switch (choice) {
            case 1:
                System.out.println("Add Student");
                break;
            case 2:
                System.out.println("Update Student");
                break;
            case 3:
                System.out.println("Delete Student");
                break;
            case 4:
                System.out.println("View Student");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

}
