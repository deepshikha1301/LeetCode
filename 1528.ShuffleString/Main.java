public class Main {

	public static void main(String[] args) {
		
		int[] nums = {4,5,6,7,0,2,1,3};
		String s = "codeleet";
		String ans = restoreString(s,nums);
		
		System.out.print(ans);
	}
	
	public static String restoreString(String s, int[] indices) {
        char[] ch = new char[indices.length];
        for(int i=0; i<indices.length; i++){
            ch[indices[i]] = s.charAt(i);
        }
        return String.valueOf(ch);
    }
}