
public class Main {

	public static void main(String[] args) {
		
		int[] nums = {1,2,34,3,4,5,7,23,12};
		boolean ans = threeConsecutiveOdds(nums);
		
		System.out.print(ans);
	}
	
	public static boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0; i<arr.length; i++){
            if(i+1<arr.length && i+2<arr.length){
                if(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0) return true;
            }
        }
        return false;
    }
}