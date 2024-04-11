import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int[] nums = {4,3,2,7,8,2,3,1};
		List<Integer> ans = findDisappearedNumbers(nums);
		
		System.out.print(ans);
	}
	
	public static List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i : nums) {
			int index = Math.abs(i);
			if (nums[index - 1] > 0) {
				nums[index - 1] *= -1;
			}
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				list.add(i + 1);
			}
		}
        return list;
    }
}