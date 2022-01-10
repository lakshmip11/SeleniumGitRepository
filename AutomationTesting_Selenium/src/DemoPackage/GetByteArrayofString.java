package DemoPackage;

public class GetByteArrayofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "my java program";
		System.out.println("Length of the String:" + str.length());
			
		byte[] b = str.getBytes();
		System.out.println("Bytes of the String:" + b.length);
				

	}

}
