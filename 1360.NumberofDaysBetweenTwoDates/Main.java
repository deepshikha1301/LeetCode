import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		
		String date1 = "2019-06-29";
		String date2 = "2019-06-30";
		int ans = daysBetweenDates(date1, date2);
		
        System.out.print(ans);
	}
	
	public static int daysBetweenDates(String date1, String date2) {
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);
        return Math.abs((int)ChronoUnit.DAYS.between(d1, d2));
    }
}

