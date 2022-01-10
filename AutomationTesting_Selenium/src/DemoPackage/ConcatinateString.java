package DemoPackage;

public class ConcatinateString {

	public static void main(String[] args) {
	
		String str1 = "This is my first program ";
		String str2 = "using Strings in Java";
		
		String str3 = str1+str2;
		System.out.println(str3);
		
		str3 = str1.concat(str2);
		System.out.println(str3);

	}

}
