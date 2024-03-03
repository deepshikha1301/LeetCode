import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int n=240, k=2;
		int ans = divisorSubstrings(n,k);
		
        System.out.println(ans);
	}
	
	public static int divisorSubstrings(int num, int k) {
        int count = 0;
        String s = String.valueOf(num);
        for(int i=0; i<s.length(); i++){
            if(i+k<=s.length()){
                String str = s.substring(i, i+k);
                int n = Integer.parseInt(str);
                if(n>0 && num%n==0) count++;
            }
        }
        return count;
    }
}