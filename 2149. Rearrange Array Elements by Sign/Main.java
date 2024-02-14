import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] nums = {3,1,-2,-5,2,-4};
		int[] ans = rearrangeArray(nums);
		
        for (int i:ans){
            System.out.print(i+" ");
        }
	}
	
	public static int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];

        int j = 0;
        int k = 1;
        for (int value : nums) {
            if (value > 0) {
                ans[j] = value;
                j += 2;
            } else {
                ans[k] = value;
                k+=2;
            }
        }
		return ans;
    }
}