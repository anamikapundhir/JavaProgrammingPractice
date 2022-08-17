package programming.practice;

public class RemoveJunkCharacters {
	
	public static void main(String[] args) {
		
		String s = "Ana1234mika$%$%$%Pun()dhir";
		
		// using regular expression
		String updated = s.replaceAll("[^a-zA-z]", "");
		System.out.println(updated);
	}
}
