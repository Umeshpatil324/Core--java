package DynamicARRAYADVANCE;

import java.util.Scanner;

public class Searchnumber2 {
	static void search(int[] arr, int key) {
		boolean found = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println("Element found at index " + i);
				found = true;
				break;
			}
		}

		if (!found)
			System.out.println("Element not found");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n = sc.nextInt();

		int[] a = new int[n];
		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.print("Enter element to search: ");
		int key = sc.nextInt();

		search(a, key);
	}
}
