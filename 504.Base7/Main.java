import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int n = 100;
		String ans = convertToBase7(n);
		
		System.out.print(ans);
	}
	
	public static String convertToBase7(int num) {
        return Integer.toString(num, 7);
    }
}