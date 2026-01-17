package DynamicARRAYADVANCE;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array:");
		int n = sc.nextInt();
		int sum = 0;
		int[] arr = new int[n];
		System.out.println("enter of array element :");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] % 2 == 0) {
				System.out.println("even numer is :" + arr[i]);
			} else {
				System.out.println("odd numer is :" + arr[i]);
			}

		}
	}

}
