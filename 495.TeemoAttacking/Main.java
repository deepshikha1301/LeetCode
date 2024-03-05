import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] timeSeries = {1,4};
		int duration = 2;
		int ans = findPoisonedDuration(timeSeries, duration);
		
		 System.out.print(ans);
	}
	
	public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum = 0;
        for(int i=0; i<timeSeries.length; i++){
            int poisonTimeEnd = timeSeries[i]+duration;
            if(i+1<timeSeries.length && timeSeries[i+1]<poisonTimeEnd){
                poisonTimeEnd = timeSeries[i+1]-timeSeries[i];
            }else{
                poisonTimeEnd = duration;
            }
            sum+=poisonTimeEnd;
        }
        return sum;
    }
}