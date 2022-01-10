package DemoPackage;

public class IndexofCharOrString {
	
	public static void main(String[] args) {
		
		/* Index of a String or Character Examples*/
		
		String str = "Index of a String in Java String programs using IndexOf method";
		
		System.out.println("Occurence of first String \"String\":" + str.indexOf("String") );
		
		System.out.println("Occurence of first character in the above String is:" + str.indexOf('i'));
		
		System.out.println("First occurence of character 'n' from the 5th index:" + str.indexOf('n', 5));
		
		System.out.println("First occurence of character 'n' from the 5th index:" + str.indexOf('n', 5));
		
		/*Character or a String at an Index */
		
		System.out.println("Character at the Index:" + str.charAt(12));
		
		System.out.println("Substring at the Index:" + str.substring(11));
		
		System.out.println("Substring at the Index of specified length:" + str.substring(21, 25) );
		
	}

}
