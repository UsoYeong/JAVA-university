
public class Q6 {

	public static void main(String[] args) {
		
		String[] items = {"dog", "hippopotamus", "cat", "elephant"};
		String longest = items[0];
		
		// For문 
		for (String word : items) {
			if (word.length() > longest.length()) {
				longest = word;
			}
		}
			System.out.println("가장 긴 단어 : " + longest);
	}

}
