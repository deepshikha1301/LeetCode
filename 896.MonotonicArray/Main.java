public class Main {

	public static void main(String[] args) {
		
		int[] nums = {1,2,2,3};
		boolean ans = isMonotonic(nums);
		
        System.out.print(ans);
	}
	
	public static boolean isMonotonic(int[] nums) {
        if(nums.length == 1)
           return true;
        if(nums[0] < nums[nums.length-1]){
            for(int i = 0; i < nums.length - 1; i++){
                if(nums[i] > nums[i + 1])
                    return false;
            }
        } else {
            for(int i = 0; i < nums.length - 1; i++){
                if(nums[i] < nums[i + 1]) return false;
            }
        }
        return true;
    }
}