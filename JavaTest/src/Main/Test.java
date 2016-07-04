package Main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		timetest();

	}

	private static void timetest() {
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss"); 
//		String time = formatter.format(new Date());
		String time = formatter.format(new Date(1467563550000L));
		System.out.println("time=="+time);
		
	}

}
