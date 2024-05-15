public class Main {

	public static void main(String[] args) {
		
		int[] nums = {3,2,-3,-4};
		int ans = returnToBoundaryCount(nums);
		
		 System.out.print(ans);
	}
	
	public static int returnToBoundaryCount(int[] nums) {
        int right = 0;
        int left = 0;
        int count = 0;

        for(int i : nums){
            if(i<0){
                left = left+i;
            }else{
                right = right+i;
            }
            if(right+left == 0){
                count++;
            }
        }
        return count;
    }
}