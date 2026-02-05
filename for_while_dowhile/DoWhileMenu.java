package for_while_dowhile;

import java.util.Scanner;

public class DoWhileMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Hello");
            System.out.println("2. Welcome");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1)
                System.out.println("Hello User!");
            else if (choice == 2)
                System.out.println("Welcome User!");
        } while (choice != 3);
    }
}

