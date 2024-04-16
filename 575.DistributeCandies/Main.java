import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int[] n = {1,1,2,2,3,3};
		int ans = distributeCandies(n);
		
        System.out.print(ans);
	}
	
	public static int distributeCandies(int[] candyType) {
        int n = candyType.length/2;
        Set<Integer> set = new HashSet<>();
        for(int i : candyType){
            set.add(i);
        }
        return Math.min(n, set.size());
    }
}