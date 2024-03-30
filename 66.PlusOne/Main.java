
public class Main {

	public static void main(String[] args) {
		
		int[] nums = {9};
		int[] ans = plusOne(nums);
		for(int i: ans){
			System.out.print(i);
		}
		
	}
	
	public static int[] plusOne(int[] nums) {
        int l = nums.length;
	for(int i=l-1; i>=0; i--) {
		if(nums[i]<9) {
			
			nums[i] = nums[i]+1;
			return nums;
		}
			nums[i] = 0;
			
		
	}
	
	int[] arr = new int[l+1];
		arr[0] = 1;
		
		return arr;
    }
}