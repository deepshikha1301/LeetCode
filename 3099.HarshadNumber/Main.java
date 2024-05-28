public class Main {

	public static void main(String[] args) {
		
		int n = 23;
		int ans = sumOfTheDigitsOfHarshadNumber(n);
		
		System.out.print(ans);
	}
	
	public static int sumOfTheDigitsOfHarshadNumber(int n) {
        int sum = 0;
        int x = n;
        while(n>0){
            int i = n%10;
            sum+=i;
            n=n/10;
        }
        if(x%sum==0){
            return sum;
        }
        return -1;
    }
}