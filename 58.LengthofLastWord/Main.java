import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		String s = "   fly me   to   the moon  ";
		int ans = lengthOfLastWord(s);
		
		System.out.print(ans);
	}
	
	public static int lengthOfLastWord(String s) {
        s=s.trim();

        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==' '){
                return s.length()-1-i;
            }
        }
        return s.length();
    }
}