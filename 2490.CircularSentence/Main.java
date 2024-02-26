import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		String s = "leetcode exercises sound delightful";
		boolean ans = isCircularSentence(s);
		
        System.out.print(ans);
	}
	
	public static boolean isCircularSentence(String sentence) {
        int len = sentence.length();
        if(sentence.charAt(0)!=sentence.charAt(len-1)){
            return false;
        }
        int i = 0;
        while(i<len){
            if(sentence.charAt(i)==' '){
                if(sentence.charAt(i-1)!=sentence.charAt(i+1)){
                    return false;
                }
            }
            i++;
        }
        return true;
    }
}