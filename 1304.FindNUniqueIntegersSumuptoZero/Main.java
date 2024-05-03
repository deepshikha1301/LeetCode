public class Main {

	public static void main(String[] args) {
		
		int n = 5;
		int[] ans = sumZero(n);
		
		for(int i : ans){
			System.out.print(i+" ");
		}
	}
	
	public static int[] sumZero(int n) {
        int[] arr = new int[n];
        int sum = 0;
        int num = 1;
        for(int i=0; i<n-1; i++){
            sum+=num;
            arr[i] = num;
            num++;
        }
        arr[n-1] = -1*sum;
        return arr;
    }
}