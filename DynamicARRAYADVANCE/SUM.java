package DynamicARRAYADVANCE;

import java.util.Scanner;

public class SUM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array:");
		int n = sc.nextInt();

		int sum = 0;

		int[] arr = new int[n];
		System.out.println("enter array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];

		}
		System.out.println("Sum = " + sum);
	}

}
