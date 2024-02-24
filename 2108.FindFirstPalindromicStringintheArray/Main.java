import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		String[] words = {"abc","car","ada","racecar","cool"};
		String s = firstPalindrome(words);
		
        System.out.println(s);
	}
	
	public static String firstPalindrome(String[] words) {
        for(String s : words){
            String sb = new StringBuilder(s).reverse().toString();
            if(sb.equals(s)){
                return s;
            }
        }
        return "";
    }
}