public class Main {

	public static void main(String[] args) {
		
	    char[] s = {'h','e','l','l','o'};
		int start = 0;
        int end = s.length - 1;
        
        char c;
        while(start<end){
            c = s[start];
            s[start] = s[end];
            s[end] = c;
            start++;
            end--;
        }
		
		for(char i: s){
			System.out.print(i+" ");
		}
        
	}
}