public class Main {

	public static void main(String[] args) {
		
		String s = "ab-cd";
		String ans = reverseOnlyLetters(s);
		
        System.out.print(ans);
	}
	
	public static String reverseOnlyLetters(String s) {
        char[] ch = s.toCharArray();
        int start=0, end=ch.length-1;

        while(start<=end){
            if(Character.isLetter(ch[start]) && Character.isLetter(ch[end])){
            	 char temp = ch[start];
                 ch[start] = ch[end];
                 ch[end] = temp;
                 end--;
                 start++;
            }else if(!Character.isLetter(ch[start])) {
            	start++;
            }else if(!Character.isLetter(ch[end])) {
            	end--;
            }
        }
        return String.valueOf(ch);
    }
}