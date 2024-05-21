public class Main {

	public static void main(String[] args) {
		
		String s = "bza";
		int ans = minTimeToType(s);
		
        System.out.print(ans);
	}
	
	public static int minTimeToType(String s) {
        char prev = 'a';
		int time = s.length();
		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);
			int dist1 = Math.abs(prev - curr);
			time = time + Math.min(dist1, 26 - dist1);
			prev = curr;
		}
        return time;
    }
}