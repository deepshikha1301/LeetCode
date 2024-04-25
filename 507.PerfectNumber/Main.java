public class Main {

	public static void main(String[] args) {
		
		int nums = 28;
		boolean ans = checkPerfectNumber(nums);
		
		 System.out.print(ans);
	}
	
	public static boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int i=1; i<=num/2; i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return num==sum;
    }
}