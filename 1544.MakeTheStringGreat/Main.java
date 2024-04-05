import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		String s = "leEeetcode";
		String ans = makeGood(s);
		
		System.out.print(ans);
	}
	
	public static String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(!st.isEmpty() && Math.abs(c - st.peek())==32){
                st.pop();
            }else{
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
        }
        return sb.toString();
    }
}