public class Main {

	public static void main(String[] args) {
		
		String s = "XX0X";
		int ans = minimumMoves(s);
		
        System.out.print(ans);
	}
	
	public static int minimumMoves(String s) {
        int count = 0;
        for(int i=0; i<s.length();){
            if(s.charAt(i)=='X'){
                count++;
                i=i+3;
            }else{
                i++;
            }
        }
        return count;
    }
}