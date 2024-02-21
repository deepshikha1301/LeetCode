import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
		int[] arr2 = {2,1,4,3,9,6};
		int[] ans = relativeSortArray(arr1, arr2);
		
        for (int i:ans){
            System.out.print(i+" ");
        }
	}
	
	public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length];
        int k=0;
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr1.length; j++){
                if(arr2[i]==arr1[j]){
                    ans[k]=arr1[j];
                    arr1[j]=-1;
                    k++;
                }
            }
        }
        Arrays.sort(arr1);
        for(int i=k; k<ans.length; k++){
            ans[k]=arr1[k];
        }
        return ans;
    }
}