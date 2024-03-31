
public class Main {

	public static void main(String[] args) {
		
		int[] nums = {4,1,2,1,2};
		int ans = singleNumber(nums);
		
		System.out.print(ans);
	}
	
	 public static int singleNumber(int[] nums) {
        int x = 0;
        for(int i : nums){
            x^=i;
        }
        return x;
    }
}