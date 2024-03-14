import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		String s = "hello";
		String ans = reverseVowels(s);
		
		System.out.print(ans);
	}
	
	public static String reverseVowels(String s) {
        String t = "aeiouAEIOU";
        char[] ch = s.toCharArray();
        int start = 0;
        int end = ch.length-1;
        while(start<end){
            while(start<end && t.indexOf(ch[start])==-1){
                start++;
            }
            while(start<end && t.indexOf(ch[end])==-1){
                end--;
            }
            char temp;
            temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return new String(ch);
    }
}