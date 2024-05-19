public class Main {

	public static void main(String[] args) {
		
		int[] nums = {-5,1,5,0,-7};
		int ans = largestAltitude(nums);
		
		 System.out.print(ans);
	}
	
	public static int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;
        for(int i=0; i<gain.length; i++){
            sum+=gain[i];
            max = Math.max(max, sum);
        }
       return max;
    }
}