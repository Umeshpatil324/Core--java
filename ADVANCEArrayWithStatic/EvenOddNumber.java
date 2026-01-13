package ADVANCEArrayWithStatic;

public class EvenOddNumber {
	public static void main(String[] args) {
		int[] arr = { 21, 48, 37, 48, 36 };
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("even number: " + arr[i]);

			} else {
				System.out.println("odd number: " + arr[i]);

			}

		}

	}

}
