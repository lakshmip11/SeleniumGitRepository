package DemoPackage;

public class charactersCountString {

	public static void main(String [] args) {
		
		String s = "I am nagalakshmi"; 
		
		System.out.println("String:" + s);
			
		int count = 0;
		
		for (int i=0; i<s.length(); i++) {
			
			if(s.charAt(i)!= ' ')
				
				count++;
				
		}
			
			System.out.println("Count of Characters in the String:" + count );
			
			
		
		
	}
	
	
}
