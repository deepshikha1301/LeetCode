import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		String s = "egg";
		String t = "add";
		boolean ans = isIsomorphic(s,t);
		
		System.out.print(ans);
	}
	
	public static boolean isIsomorphic(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        for(int i=0; i<s1.length; i++){
            if(map.containsKey(s1[i])){
                char c = map.get(s1[i]);
                if(c!=t1[i]) return false;
            }else if(map.containsValue(t1[i])){
                return false;
            }else{
                map.put(s1[i], t1[i]);
            }
        }
        return true;
    }
}