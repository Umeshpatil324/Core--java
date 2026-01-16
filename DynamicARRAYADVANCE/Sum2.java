package DynamicARRAYADVANCE;

import java.util.Scanner;

 public class Sum2 {
	 
	     static int sum(int[] arr) {
	         int total = 0;
	         for (int i = 0; i < arr.length; i++) {
	             total += arr[i];
	         }
	         return total;
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

	         System.out.println("Sum = " + sum(a));
	     }
	 }
