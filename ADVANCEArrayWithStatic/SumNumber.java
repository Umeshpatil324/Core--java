package ADVANCEArrayWithStatic;

public class SumNumber {
	public static void main(String[] args) {
		int[] arr = { 256, 255, 265, 458, 145 };
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			num = num + arr[i];

		}
		System.out.println("sum: " + num);

	}

}
