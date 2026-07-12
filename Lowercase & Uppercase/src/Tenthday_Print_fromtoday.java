import java.util.*;
import java.time.LocalDate; 
public class Tenthday_Print_fromtoday {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate TenthDay = today.plusDays(10);
		System.out.println(TenthDay);
	}

}
