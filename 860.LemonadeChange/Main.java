import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] nums = {5,5,5,10,20};
		boolean ans = lemonadeChange(nums);
		
		 System.out.print(ans);
	}
	
	public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for(int i:bills){
            if(i==5){
                five++;
            }else if(i==10){
                five--;
                ten++;
            }else{
                if(ten>0){
                    ten--;
                    five--;
                }else{
                    five = five-3;
                }
            }
            if(five<0 || ten<0){
                return false;
            }
        }
        
        return true;
    }
}