import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}
	
	public static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String sb = new StringBuilder(str).reverse().toString();
        return sb.equals(str);
    }
}