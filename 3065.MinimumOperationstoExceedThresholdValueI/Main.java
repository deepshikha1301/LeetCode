public class Main {

	public static void main(String[] args) {
		
		int[] s = {2,11,10,1,3};
		int k = 10;
		int ans = minOperations(s, k);
		
        System.out.print(ans);
	}
	
	public static int minOperations(int[] nums, int k) {
        int count = 0;
        for(int i : nums){
            if(i<k){
                count++;
            }
        }
        return count;
    }
}