import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		String n = "Hello, my name is John";
		int ans = countSegments(n);
		
        System.out.print(ans);
	}
	
	public static int countSegments(String s) {
        int count = 0;
        StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			count++;
            st.nextToken();
		}
        return count;
    }
}