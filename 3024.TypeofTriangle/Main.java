public class Main {

	public static void main(String[] args) {
		
		int[] nums = {3,4,5};
		String ans = triangleType(nums);
		
		 System.out.print(ans);
	}
	
	public static String triangleType(int[] nums) {
        if(nums[0]==nums[1] && nums[0]==nums[2]){
            return "equilateral";}

        if((nums[0]+nums[1] > nums[2]) &&
            (nums[1]+nums[2] > nums[0]) &&
            (nums[0]+nums[2] > nums[1])){
            if(nums[0]==nums[1] || nums[0]==nums[2] || nums[1]==nums[2]){
                return "isosceles";
            }else{
                return "scalene";
            }
                
        }
        return "none";
    }
}