import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5};
		int k = 3;
		int ans = maximizeSum(nums, k);
		
		 System.out.print(ans);
	}
	
	public static int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums[nums.length-1];
        return (n*k)+((k*(k-1))/2);
    }
}