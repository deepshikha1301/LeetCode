import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,4,3,2,1};
		boolean ans = hasGroupsSizeX(arr);
		
        System.out.print(ans);
	}
	
	public static boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : deck){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int min = Integer.MAX_VALUE;
        
        for(int j : map.keySet()){
            min = Math.min(min, map.get(j));
        }

        for(int k=min; k>=2; k--){
            boolean lcd = true;
            for(int j : map.keySet()){
                if(map.get(j)%k != 0) lcd=false;
            }
            if(lcd==true) return true;
        }
        return false;
    }
}