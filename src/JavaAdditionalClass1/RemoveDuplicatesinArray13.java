package JavaAdditionalClass1;

import java.util.Arrays;

public class RemoveDuplicatesinArray13 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 3, 1, 4, 2, 3, 3, 6, 7, 9, 12, 13, 32 };
		int uniqueCount = 0;
		for (int i = 0; i < nums.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (nums[j] == nums[i]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				nums[uniqueCount] = nums[i];
				uniqueCount++;
			}
		}
		System.out.println("Array with duplicates removed: " + Arrays.toString(Arrays.copyOf(nums, uniqueCount)));
	}
}