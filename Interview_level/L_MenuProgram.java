package Interview_level;

import java.util.Scanner;

public class L_MenuProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. Exit");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Addition selected");
            } else if (choice == 2) {
                System.out.println("Subtraction selected");
            }
        } while (choice != 3);
    }
}
