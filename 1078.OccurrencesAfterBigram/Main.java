import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		String text = "alice is a good girl she is a good student";
        String first = "a";
        String second = "good";
		String[] ans = findOcurrences(text, first, second);
		for(String s:ans){
			System.out.println(s);
		}
        
	}
	
	public static String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<>();
        String[] str = text.split(" ");
        for(int i=0; i<str.length; i++){
            if(str[i].equals(first) && i+1<str.length && i+2<str.length){
                if(str[i+1].equals(second)){
                    list.add(str[i+2]);
                }
            }
        }
        return list.toArray(new String[0]);
    }
}