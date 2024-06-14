public class Main {

	public static void main(String[] args) {
		
		String s = "010";
		String ans = maximumOddBinaryNumber(s);
		
		System.out.print(ans);
	}
	
	public static String maximumOddBinaryNumber(String s) {
        int c1=0;
        char[] arr = s.toCharArray();

        for(int i=0; i<arr.length; i++){
            if(arr[i]=='1'){
                arr[i] = '0';
                c1++;
            }
        }

        if(c1>1){
            for(int i=0; i<c1-1; i++){
                arr[i] = '1';
            }
        }
        arr[arr.length-1] = '1';
        return new String(arr);
    }
}