package JavaAdditionalClass1;

import java.util.Arrays;

public class LargeElementArray8 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 13, 15, 166, 2989, 302 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length / 2; i++) {

			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		System.out.println("The second largest number in arrays is " + arr[1]);
	}
}