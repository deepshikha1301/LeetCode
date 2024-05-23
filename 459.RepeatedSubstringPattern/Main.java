public class Main {

	public static void main(String[] args) {
		
		String s = "abab";
	
		boolean ans = repeatedSubstringPattern(s);
		
        System.out.print(ans);
	}
	
	public static boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for(int i=n/2; i>=1; i--){
            if(n%i==0){
                String str = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for(int j=1; j<=n/i; j++){
                    sb.append(str);
                }
                if(sb.toString().equals(s)){
                    return true;
                }
            }
        }
        return false;
    }
}