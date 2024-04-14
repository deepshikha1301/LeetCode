public class Main {

	public static void main(String[] args) {
		
		String s = "FlaG";
		boolean ans = detectCapitalUse(s);
		
        System.out.print(ans);
	}
	
	public static boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase())){
            return true;
        }

        if(word.equals(word.toLowerCase())){
            return true;
        }

        int c = word.charAt(0);
        if(c>=65 && c<91){
            String s = word.substring(1);
            if(s.equals(s.toLowerCase())){
                return true;
            }
        }
        return false;
    }
}