import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int n = 121;
		boolean ans = isPalindrome(n);
		
		System.out.print(ans);
	}
	
	public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if(sb.toString().equals(s)){
            return true;
        }else{
            return false;
        }
    }
}