import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		String word = "a1b01c001";
		int ans = numDifferentIntegers(word);
		
         System.out.print(ans);
	}
	
	public static int numDifferentIntegers(String word) {
        String[] str = word.replaceAll("[a-z]", " ").split("\\s+");
		Set<String> set = new HashSet<>();

		for(String s:str ) {
			if(!s.isEmpty()) {
				set.add(s.replaceAll("^0*", ""));
			}
		}
		
        return set.size();
    }
}