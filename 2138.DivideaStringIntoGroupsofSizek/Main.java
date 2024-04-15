import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		String s = "abcdefghij";
		int k = 3;
		char fill = 'x';
		String[] ans = divideString(s,k,fill);
		
		for(String str : ans){
			System.out.print(str+" ");
		}
        
	}
	
	public static String[] divideString(String s, int k, char fill) {
        List<String> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i += k) {
			if (i + k < s.length()) {
				String str = s.substring(i, i + k);
				list.add(str);
			} else {
				StringBuilder sb = new StringBuilder(s.substring(i));
				while(sb.length()<k){
                    sb.append(fill);
                }
				list.add(sb.toString());
			}
		}
        return list.toArray(new String[0]);
    }
}