public class Main {

	public static void main(String[] args) {
		
		String s = "aaAbcBC";
		int ans = numberOfSpecialChars(s);
		
        System.out.print(ans);
	}
	
	public static int numberOfSpecialChars(String word) {
        int count = 0;
        int[] arr = new int[58];
        for(int i=0; i<word.length(); i++){
            arr[word.charAt(i) - 'A']++;
        }

        for(int i=0; i<26; i++){
           if(arr[i]>0 && arr[i+32]>0){
            count++;
           }
        }
        return count;
    }
}