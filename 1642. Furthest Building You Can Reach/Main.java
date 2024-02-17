import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		int[] heights = {4,12,2,7,3,18,20,3,19};
		int bricks = 10;
		int ladders = 2;
		
		int index = furthestBuilding(heights, bricks, ladders);
		
		System.out.println(index);
		
		
	}
	
	public static int furthestBuilding(int[] heights, int bricks, int ladders) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0; i<heights.length-1; i++) {
			int diff = heights[i+1]-heights[i];
			if(diff>0) {
				pq.offer(diff);
				if(pq.size()>ladders) {
					bricks-=pq.poll();
				}
				if(bricks<0) {
					return i;
				}
			}
		}
		return heights.length-1;
    }
}