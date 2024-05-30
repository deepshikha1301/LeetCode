public class Main {

	public static void main(String[] args) {
		
		int n = 4;
		int ans = numberOfCuts(n);
		
        System.out.print(ans);
	}
	
	public static int numberOfCuts(int n) {
        if(n==1) return 0;
        if(n%2==0) return n/2;
        return n;
    }
}