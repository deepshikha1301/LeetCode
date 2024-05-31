import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int left = 1;
		int right = 22;
		List<Integer> list = selfDividingNumbers(left, right);
		for(int i : list){
			System.out.print(i+" ");
		}
        
	}
	
	public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i=left; i<=right; i++){
            if(divisibleCheck(i)){
                list.add(i);
            }
        }
        return list;
    }

    private static boolean divisibleCheck(int x){
        int n = x;
        while(n>0){
            if(n%10==0){
                return false;
            }
            if(x%(n%10)!=0){
                return false;
            }
            n=n/10;
        }
        return true;
    }
}