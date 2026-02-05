package for_while_dowhile;

import java.util.Scanner;

public class DoWhilePassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password;

        do {
            System.out.print("Enter password: ");
            password = sc.nextInt();
        } while (password != 1234);

        System.out.println("Access Granted");
    }
}

