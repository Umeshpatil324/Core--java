package for_while_dowhile;

import java.util.Scanner;

public class WhileCountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int count = 0;

        while (num != 0) {
            count++;
            num /= 10;
        }

        System.out.println("Total digits = " + count);
    }
}
