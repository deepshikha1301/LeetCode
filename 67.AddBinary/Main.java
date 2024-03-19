import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		String s = "1010";
		String t = "1011";
		String ans = addBinary(s,t);
		
		System.out.print(ans);
	}
	
	public static String addBinary(String s, String t) {
        StringBuilder sb = new StringBuilder();
		int carry = 0, i=s.length()-1, j=t.length()-1;
		
		while(i>=0 || j>=0) {
			int sum = 0;
			if(i>=0) sum = sum+s.charAt(i)-'0';
			if(j>=0) sum = sum+t.charAt(j)-'0';
			sum = sum + carry;
			carry = 0;
			
			if(sum==2) {
				sb.append(0);
				carry = 1;
			}else if(sum==3) {
				sb.append(1);
				carry = 1;
			}else {
				sb.append(sum);
			}
			i--;
			j--;
		}
		if(carry!=0) {
			sb.append(carry);
		}
		
		return sb.reverse().toString();
    }
}