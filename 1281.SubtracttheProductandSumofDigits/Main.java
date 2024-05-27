import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int n = 4421;
		int ans = subtractProductAndSum(n);
		
		System.out.print(ans);
	}
	
	public static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;

        while(n>0){
            int t = n%10;
            sum+=t;
            product*=t;
            n=n/10;
        }
        return product - sum;
    }
}