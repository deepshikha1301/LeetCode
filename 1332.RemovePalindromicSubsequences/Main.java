public class Main {

	public static void main(String[] args) {
		
		String s = "abb";
		int ans = removePalindromeSub(s);
		
        System.out.print(ans);
	}
	
	public static int removePalindromeSub(String s) {
        if(isPalindrome(s)) return 1;
        return 2;
    }

    public static boolean isPalindrome(String s){
        int i=0, j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}