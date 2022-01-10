package DemoPackage;

public class CharactersinString {

	public static void main(String[] args) {
		
		String s = "nagalakshmi";
		
		System.out.println("Individual characters in the string:");
		
		for(int i = 0; i<s.length(); i++) {
		
			System.out.println(s.charAt(i));
		
		}
	}
}
