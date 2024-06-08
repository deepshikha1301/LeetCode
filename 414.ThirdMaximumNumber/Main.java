import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int[] nums = {5,2,2};
		int ans = thirdMax(nums);
		
		 System.out.print(ans);
	}
	
	public static int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int[] arr = new int[set.size()];
        int i=0;
        for(int num:set){
            arr[i++]=num;
        }
        Arrays.sort(arr);
        return (arr.length>=3)?arr[arr.length-3]:arr[arr.length-1];
    }
}