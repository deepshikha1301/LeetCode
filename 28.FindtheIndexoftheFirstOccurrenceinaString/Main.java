public class Main {

	public static void main(String[] args) {
		
		String haystack = "sadbutsad";
		String needle = "sad";
		int ans = strStr(haystack, needle);
		
        System.out.print(ans);
	}
	
	public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}