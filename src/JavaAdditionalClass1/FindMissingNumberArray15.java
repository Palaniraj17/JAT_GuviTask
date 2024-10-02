package JavaAdditionalClass1;

public class FindMissingNumberArray15 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,6};

		for (int i = 1; i <=a.length; i++) {
			
			if(i!=a[i-1])
			{
				System.out.println("The missing number is "+i);
			}}
	}
}