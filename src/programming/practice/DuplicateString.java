package programming.practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
/**
 * O(n) time
 * @author anami
 *
 */

public class DuplicateString {

	public static void main(String[] args) throws IOException {
		String skills[] = { "Java", "Selenium", "Testng", "Jira", "Java", "RestAssured", "Java", "Selenium"};
		
//		// using hashmap
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		for (String skill : skills) {
//			Integer count = map.get(skill);
//			if (count == null) {
//				// First occurance
//				map.put(skill, 1);
//				
//			} else if (count != 2){
//				// Second occurance
//				map.put(skill, 2);
//				System.out.println("Duplicate string is : " + skill);
//			} else  {
//				// After second occurance
//				continue;
//				
//			}
//
//		}
		final Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String");
		String nextLine = scanner.nextLine();
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.out.print));
		
        String result = returnDuplicateString(nextLine);
        
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();

//		returnDuplicateString();
	}
	
	public static String returnDuplicateString(String s) {
		// using hashset
//		String s = "radar";
		char[] charArray = s.toLowerCase().trim().toCharArray();
		Set<Character> set = new HashSet<Character>();
		String duplicateString = null;
		for (Character duplicate : charArray) {
			if (set.add(duplicate) == false) {
				duplicateString = String.valueOf(duplicate);
			}
			continue;
		}
		return duplicateString;
	}
}
