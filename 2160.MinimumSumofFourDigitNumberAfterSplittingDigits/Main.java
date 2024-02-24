import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int num = 2932;
		int ans = minimumSum(num);
		
		 System.out.print(ans);
	}
	
	public static int minimumSum(int num) {
        int[] nums = new int[4];
        int i=0;
        while(num>0){
            nums[i] = num%10;
            i++;
            num=num/10;
        }
        Arrays.sort(nums);
        return ((nums[0]*10)+nums[2])+((nums[1]*10)+nums[3]);
    }
}