public class Main {

	public static void main(String[] args) {
		
		int a = 12, b = 6;
		int ans = commonFactors(a,b);
		
        System.out.print(ans);
	}
	
	public static int commonFactors(int a, int b) {
        int count = 1;
        int n = a;
        if(a>b){
            n=b;
        }
        for(int i=2; i<=n; i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }
}