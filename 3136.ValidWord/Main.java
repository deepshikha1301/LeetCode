public class Main {

	public static void main(String[] args) {
		
		String s = "234Adas";
		boolean ans = isValid(s);
		
        System.out.print(ans);
	}
	
	public static boolean isValid(String word) {
        String s = "aeiouAEIOU";
        boolean hasVowel = false;
        boolean hasConsonant = false;
        boolean spcl = false;
        for(char c : word.toCharArray()){
            if(Character.isLetter(c)){
                if(s.indexOf(c) != -1){
                    hasVowel = true;
                }else{
                    hasConsonant = true;
                }
            }else if(Character.isDigit(c)){
                continue;
            }else{
                spcl = true;
            }
        }
        return word.length()>=3 && hasVowel && hasConsonant && !spcl;
    }
}