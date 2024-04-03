import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		String s = "abba";
		String t = "dog cat cat dog";
		boolean ans = wordPattern(s, t);
		
        System.out.print(ans);
	}
	
	public static boolean wordPattern(String pattern, String s) {
        char[] p = pattern.toCharArray();
        String[] str = s.split(" ");
        Map<Character, String> map = new HashMap<>();
        if(p.length!=str.length) {
        	return false;
        }
        for(int i=0; i<str.length; i++){
            if(map.containsKey(p[i])){
                String val = map.get(p[i]);
                if(!val.equals(str[i])) return false;
            }else if(map.containsValue(str[i])){
                return false;
            }else {
            	map.put(p[i], str[i]);
            }
        }
        return true;
    }
}