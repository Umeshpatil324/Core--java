package Interview_level;

import java.util.Scanner;

public class L_DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int even = 0, odd = 0;

        while (num != 0) {
            int d = num % 10;
            if (d % 2 == 0) even++;
            else odd++;
            num /= 10;
        }

        System.out.println("Even digits: " + even);
        System.out.println("Odd digits: " + odd);
    }
}

