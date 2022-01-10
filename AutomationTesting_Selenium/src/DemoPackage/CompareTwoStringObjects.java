package DemoPackage;

public class CompareTwoStringObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "JAVA";
		String str2 = "java";
		
		if(str1.equals(str2))
		{
			System.out.println("Both strings are equal");
		} else
		{
			System.out.println("Both strings are not equal");
		}
    
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("Both strings are equal");
		} else
		{
			System.out.println("Both strings are not equal");
		}
	
	}

}
