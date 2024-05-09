public class Main {

	public static void main(String[] args) {
		
		String s = "hello";
		int ans = scoreOfString(s);
		
        System.out.print(ans);
	}
	
	public static int scoreOfString(String s) {
        int sum = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			sum = sum + Math.abs(s.charAt(i) - s.charAt(i + 1));
		}
        return sum;
    }
}