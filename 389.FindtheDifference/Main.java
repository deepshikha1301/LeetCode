public class Main {

	public static void main(String[] args) {
		
		String s = "abcd";
		String t = "abced";
		char ans = findTheDifference(s, t);
		
        System.out.print(ans);
	}
	
	public static char findTheDifference(String s, String t) {
        int i = s.length();
		char ch = t.charAt(i--);
		for (; i > -1; i--)
			ch ^= (s.charAt(i) ^ t.charAt(i));
		return ch;
    }
}