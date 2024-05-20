public class Main {

	public static void main(String[] args) {
		
		String s = "abcde";
		String t = "edbac";
		int ans = findPermutationDifference(s, t);
		
        System.out.print(ans);
	}
	
	public static int findPermutationDifference(String s, String t) {
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            int index = t.indexOf(s.charAt(i));
            sum+=Math.abs(i-index);
        }
        return sum;
    }
}