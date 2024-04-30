public class Main {

	public static void main(String[] args) {
		
		int num = 9669;
		int ans = maximum69Number(num);
		
		System.out.print(ans);
	}
	
	public static int maximum69Number (int num) {
        String s = String.valueOf(num);
        char[] ch = s.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[i]=='6'){
                ch[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(ch));
    }
}