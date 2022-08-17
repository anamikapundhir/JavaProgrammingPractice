package programming.practice;

public class StringReverse {

	public static void main(String[] args) {

		String str = "Anamika";
		int length = str.length();
		String reverse = "";

		// 1. for loop
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		System.out.println(reverse);

		
		// 2. using StringBuffer
		StringBuffer sf = new StringBuffer(str);
		StringBuffer reverseString = sf.reverse();
		System.out.println(reverseString);
	}
}