public class Main {

	public static void main(String[] args) {
		
		int[] nums = {1,2,1};
		int[] ans = getConcatenation(nums);
		
		for(int i: ans){
			System.out.print(i+" ");
		}
        
	}
	
	 public static int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[2*len];
        for(int i=0; i<len; i++){
            ans[i]=nums[i];
            ans[i+len] = nums[i];
        }
        return ans;
    }
}