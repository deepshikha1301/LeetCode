import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[][] trust = {{1,3},{2,3},{3,1}};
		int n = 3;
		int ans = findJudge(n,trust);
		
        System.out.print(ans);
	}
	
	 public static int findJudge(int n, int[][] trust) {
        int[] trusts = new int[n+1];
        int[] trusted = new int[n+1];

        for(int i=0; i<trust.length; i++){
            trusts[trust[i][0]]++;
            trusted[trust[i][1]]++;
        }

        for(int i=1; i<=n; i++){
            if(trusts[i]==0 && trusted[i]==(n-1)){
                return i;
            }
        }
        return -1;
    }
}