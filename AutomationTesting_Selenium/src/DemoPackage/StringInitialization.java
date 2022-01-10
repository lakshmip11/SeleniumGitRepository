package DemoPackage;

public class StringInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "This is a String Object 1";
		
		System.out.println(str1);
		
		String str2 = new String("This is a String Object 2");
		
		System.out.println(str2);

		char[] c = {'a', 'b', 'c', 'd'};
		
		System.out.println(c);
		
		String str3 = new String(c);
		
		System.out.println(str3);
		
		String str4 = str1 + str2;
		
		System.out.println(str4);
	}

}
