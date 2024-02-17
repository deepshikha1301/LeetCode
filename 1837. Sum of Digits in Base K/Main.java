import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int n = 34, k=6;
		int ans = sumBase(n,k);
		
        System.out.println(ans);
	}
	
	public static int sumBase(int n, int k) {
        int sum = 0;
        while(n>0){
            int temp = n%k;
            sum = sum+temp;
            n=n/k;
        }
        return sum;
    }
}