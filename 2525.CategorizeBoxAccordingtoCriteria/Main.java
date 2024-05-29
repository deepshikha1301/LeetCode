public class Main {

	public static void main(String[] args) {
		
		int length = 1000;
		int width = 35;
		int height = 700;
		int mass = 300;
		String ans = categorizeBox(length, width, height, mass);
		
        System.out.print(ans);
	}
	
	public static String categorizeBox(int length, int width, int height, int mass) {
        boolean bulky = false;
        boolean heavy = false;

        long product = (long)length*width*height;
        if((length>=10000 || width>=10000 || height>=10000)
            || (product >= 1000000000)){
                bulky = true;
        }
        if(mass>=100){
            heavy = true;
        }

        if(bulky && heavy){
            return "Both";
        }else if(bulky){
            return "Bulky";
        }else if(heavy){
            return "Heavy";
        }else{
            return "Neither";
        }
    }
}