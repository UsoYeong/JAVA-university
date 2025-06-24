
public class StringMessod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = new String("abc");
		String str5 = "Abc";
		
		System.out.println("str1.length() = " + str1.length());
		System.out.println("str1.charAt(2) = " + str1.charAt(2));
		System.out.println("str1.equals(str3) = " + str1.equals(str3));
		System.out.println("str1.contains(bc) = " + str1.contains("bc"));


	}

}
