public class Main {

	public static void main(String[] args) {
		
		int[][] dominoes = {{1,2},{1,2},{1,1},{1,2},{2,2}};
		int ans = numEquivDominoPairs(dominoes);
		
		System.out.print(ans);
	}
	
	public static int numEquivDominoPairs(int[][] dominoes) {
        int[] counts = new int[100];
        int pairs = 0;
        for(int[] domino:dominoes){
            int up = Math.min(domino[0], domino[1]);
            int down = Math.max(domino[0], domino[1]);

            pairs += counts[up * 10 + down]++;
        }
        return pairs;
    }
}