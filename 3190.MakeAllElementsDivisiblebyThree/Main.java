public class Main {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4};
		int ans = minimumOperations(nums);
		
        System.out.print(ans);
	}
	
	public static int minimumOperations(int[] nums) {
        int count = 0;
        for(int i : nums){
            if(i%3!=0){
                count++;
            }
        }
        return count;
    }
}