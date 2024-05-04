public class Main {

	public static void main(String[] args) {
		
		String s = "leetcode";
		boolean ans = isSubstringPresent(s);
		
        System.out.print(ans);
	}
	
	public static boolean isSubstringPresent(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        for(int i=0; i<s.length(); i++){
            if(i+2<=s.length() && sb.indexOf(s.substring(i, i+2)) != -1){
                return true;
            }
        }
        return false;
    }
}