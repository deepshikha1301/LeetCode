import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] nums = {3,2,3};
		int min = majorityElement(nums);
		
        System.out.println(min);
	}
	
	public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}