package DemoPackage;

public class CompareStringObjStringBufferObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Comparing String content with a StringBuffer content";
		StringBuffer strb = new StringBuffer("Comparing String content with a StringBuffer content");
		
		if(str.contentEquals(strb))
		{
			System.out.println("Both the contents are equal");
		} else
		{
			System.out.println("Both the contents are not equal");
		}
		
		StringBuffer strb1 = new StringBuffer("Not Comparing String content with a StringBuffer content");
		
		if(str.contentEquals(strb1))
		{
			System.out.println("Both the contents are equal");
		} else
		{
			System.out.println("Both the contents are not equal");
		}

	}

}
