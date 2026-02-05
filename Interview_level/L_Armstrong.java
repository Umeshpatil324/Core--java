package Interview_level;

import java.util.Scanner;

public class L_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num, sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        System.out.println(original == sum ? "Armstrong" : "Not Armstrong");
    }
}

