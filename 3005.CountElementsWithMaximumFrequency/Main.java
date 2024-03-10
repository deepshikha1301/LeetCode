import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int[] nums = {1,2,2,3,1,4};
		int ans = maxFrequencyElements(nums);
		
		System.out.print(ans);
	}
	
	public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
            max = Math.max(max, map.get(i));
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()==max){
                count+=entry.getValue();
            }
        }
        return count;
    }
}