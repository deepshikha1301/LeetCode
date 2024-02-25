import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int n = 8;
		int ans = pivotInteger(n);
		
        System.out.print(ans);
	}
	
	public static int pivotInteger(int n) {
        int sum1=0, sum2=0;
        for(int i=n; i>0; i--){
            sum1 = (i*(i+1))/2;
            sum2+=i;
            if(sum1==sum2) return i;
        }
        return -1;
    }
}