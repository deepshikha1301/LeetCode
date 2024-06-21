public class Main {

	public static void main(String[] args) {
		
		int[][] nums = {{1,2,3},{5,6,7},{9,10,11}};
		int ans = diagonalPrime(nums);
		
        System.out.print(ans);
	}
	
	public static int diagonalPrime(int[][] nums) {
        int max = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i][i]>max && isPrime(nums[i][i])){
                max = Math.max(max, nums[i][i]);
            }
            if(nums[i][nums.length-1-i]>max && isPrime(nums[i][nums.length-1-i])){
                max = Math.max(max, nums[i][nums.length-1-i]);
            }
        }
        return max;
    }
	
	private static boolean isPrime(int n){
        if(n==0||n==1){
            return false;
        }
        for(int j=2; j<=Math.sqrt(n); j++){
            if(n%j==0){
                return false;
            }
        }
        return true;
    }
}