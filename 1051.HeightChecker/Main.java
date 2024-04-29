import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int[] nums = {1,1,4,2,1,3};
		int ans = heightChecker(nums);
		
		System.out.print(ans);
	}
	
	public static int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        int count = 0;
        for(int i=0; i<heights.length; i++){
            if(heights[i]!=expected[i]){
                count++;
            }
        }
        return count;
    }
}