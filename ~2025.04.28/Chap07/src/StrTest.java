
public class StrTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = new String("abc");
		String str5 = "Abc";
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str3 == str4);
		System.out.println(str1 == str5);
		
		
	}

}
