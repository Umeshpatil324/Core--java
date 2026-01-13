package BasicArray.com;

public class NormalArrayMethod {

	// Normal method
	static void displayArray() {

		int[] arr = { 10, 20, 333, 40 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		System.out.println("Sum of array elements = " + sum);
	}

	public static void main(String[] args) {
		displayArray(); // method call
	}
}
