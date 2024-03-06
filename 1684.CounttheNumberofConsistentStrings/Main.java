import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		String[] words = {"ad","bd","aaab","baa","badab"};
		String allowed = "ab";
		int ans = countConsistentStrings(allowed, words);
		
		 System.out.print(ans);
	}
	
	public static int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for(char c : allowed.toCharArray()){
            set.add(c);
        }
        int count = 0;
        boolean flag;
        for(String s : words){
            flag = true;
            for(char ch : s.toCharArray()){
                if(!set.contains(ch)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
    }
}