import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] nums = {1,3,3,2};
		boolean ans = isGood(nums);
		
		 System.out.print(ans);
	}
	
	public static boolean isGood(int[] nums) {
        int n = nums.length;
        int count = 1;
        if(n==1){
            return false;
        }
        Arrays.sort(nums);
        for(int i=0; i<n-1; i++){
            if(nums[i]==count){
                count++;
            }else{
                return false;
            }
        }
        if(count-1 == nums[n-1]){
            return true;
        }
        return false;
    }
}