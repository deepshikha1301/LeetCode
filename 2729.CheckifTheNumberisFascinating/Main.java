import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int n = 192;
		boolean ans = isFascinating(n);
		
        System.out.println(ans);
	}
	
	public static boolean isFascinating(int n) {
        String s = "123456789";
        int n1 = n*2;
        int n2 = n*3;
        StringBuilder sb = new StringBuilder();
        char[] ch = sb.append(n).append(n1).append(n2).toString().toCharArray();
        Arrays.sort(ch);
        if(String.valueOf(ch).equals(s)){
            return true;
        }
        return false;
    }
}