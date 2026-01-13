package ADVANCEArrayWithStatic;

public class AverageOfNumber {
	public static void main(String[] args) {
		int[] arr = { 25, 266, 45, 58, 58 };

		int num = 0;

		for (int i = 0; i < arr.length; i++) {
			num = num + arr[i];
			System.out.println("" + num);
		}
		double avg = (double) num / arr.length;

		System.out.println("Average: " + avg);
	}

}
