import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] nums = {-1,-2,-3,-4,3,2,1};
		int ans = arraySign(nums);
		
        System.out.println(ans);
	}
	
	public static int arraySign(int[] nums) {
        int count = 0;
        for(int i:nums){
            if(i==0) {
                return 0;
            }else if(i<0){
                count++;
            }
        }
        if(count%2==0){
            return 1;
        }else{
            return -1;
        }
    }
}