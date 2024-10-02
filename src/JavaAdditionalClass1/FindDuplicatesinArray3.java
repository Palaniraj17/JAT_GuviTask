package JavaAdditionalClass1;

public class FindDuplicatesinArray3 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 2, 3, 4, 5, 6, 6, 7, 8 };
		System.out.println("The repeated values are listed below");
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = i + 1; j <= a.length - 1; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}