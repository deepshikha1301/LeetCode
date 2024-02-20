import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
	    int[] nums = {3,0,1};
		int ans = missingNumber(nums);
		System.out.print(ans);
	}
		
	 public static int missingNumber(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        return nums.length*(nums.length+1)/2 - sum;
    }
}