import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,1};
		boolean ans = containsDuplicate(nums);
		
		System.out.print(ans);
	}
	
	public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            if(set.contains(i)){
                return true;
            }else{
                set.add(i);
            }
        }
        return false;
    }
}