package BasicArray.com;

import java.util.Scanner;

public class DynamicMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name:");
		String[] arr = new String[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
			System.out.print(arr[i]);
		}

	}

}
