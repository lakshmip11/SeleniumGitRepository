package DemoPackage;

public class CharacterArrayToStringObj {

	public static void main(String[] args) {
		
		char ch[] = {'M','y',' ','J','a','v','a',' ','e','x','a','m','p','l','e'};
		
		String str1 = String.copyValueOf(ch); //We can copy a char array to a string
		System.out.println(str1);
		
		String str2 = String.copyValueOf(ch, 8, 7); //We can also copy only range of characters in an array
		System.out.println(str2);
		
		
	}

}
