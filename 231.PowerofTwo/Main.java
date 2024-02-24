import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int n = 16;
		boolean ans = isPowerOfTwo(n);
		System.out.print(ans);
	}
		
	public static boolean isPowerOfTwo(int n) {
        int a = 0;
        while(true){
            if(Math.pow(2, a)==n){
                return true;
            }else if(Math.pow(2,a)<n){
                a++;
            }else{
                return false;
            }
        }
    }
}