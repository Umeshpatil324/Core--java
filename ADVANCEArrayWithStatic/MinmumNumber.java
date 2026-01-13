package ADVANCEArrayWithStatic;

public class MinmumNumber {
	public static void main(String[] args) {
		int[] arr = { 20, 48, 36, 48, 36 };
		int maxvalue = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < maxvalue) {
				maxvalue = 0;
			}

		}
		System.out.println("Maximum value: " + maxvalue);
	}

}
