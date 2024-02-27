import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[][] nums = {{1,2,4},{3,3,1}};
		int ans = deleteGreatestValue(nums);
		
		 System.out.print(ans);
	}
	
	public static int deleteGreatestValue(int[][] grid) {
        int n = grid[0].length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=1; i<=n; i++){
            for(int[] a : grid){
                Arrays.sort(a);
                max = Math.max(max, a[a.length-1]);
                a[a.length-1]=-1;
            }
            sum+=max;
            max = Integer.MIN_VALUE;
        }
        return sum;
    }
}