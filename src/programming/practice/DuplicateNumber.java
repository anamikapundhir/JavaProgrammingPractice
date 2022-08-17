package programming.practice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 3, 6 };

		// compare each element
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("Duplicate no is : " + a[i]);
				}
			}
		}

		// using hashset
		Set<Integer> set = new HashSet<Integer>();
		for (int no : a) {
			if (set.add(no) == false) {
				System.out.println("Duplicate no is : " + no);
			}
		}
	}
}
