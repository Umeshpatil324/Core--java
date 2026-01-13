package BasicArray.com;

import java.util.Scanner;

public class DynamicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number:");
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			System.out.print(" "  + arr[i]);
		}

	}

}
