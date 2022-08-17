package programming.practice;

public class MissingNumber {

	public static void main(String[] args) {

		int a[] = {1,2,3,5};
		int sum1 = 0;
		int sum2 = 0;
		for (int i=0; i<a.length; i++) {
			sum1 = sum1 + a[i];
		}
		
		System.out.println("Array total : " + sum1);
		
		for (int j=1; j<=5; j++) {
			sum2 = sum2 + j;
		}
		
		System.out.println("Actual total : " + sum2);
		
		System.out.println("Missing no. : " + (sum2-sum1));
	}

}
