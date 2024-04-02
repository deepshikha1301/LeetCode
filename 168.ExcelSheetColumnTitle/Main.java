import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int n = 701;
		String ans = convertToTitle(n);
		
		System.out.print(ans);
	}
	
	public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
		while(columnNumber>0) {
            columnNumber -= 1;
			int digit = (columnNumber)%26;
			sb.append((char)('A'+digit));
			columnNumber = columnNumber/26;
		}
        return sb.reverse().toString();
    }
}