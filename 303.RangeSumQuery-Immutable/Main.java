
public class Main {

	public static void main(String[] args) {
		
		int[] nums = {-2, 0, 3, -5, 2, -1};
		NumArray obj = new NumArray(nums);
        int ans = obj.sumRange(0,2);
		
		 System.out.print(ans);
	}
}

class NumArray {

    int[] arr;
    public NumArray(int[] nums) {
        this.arr=nums;
    }
    
    public int sumRange(int left, int right) {
        int sum=0;
        for(int i=left; i<=right; i++){
            sum+=arr[i];
        }
        return sum;
    }
}