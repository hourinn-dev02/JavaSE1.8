package cn.hourinn.demo.util;



import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		
		//得到1970年以后的毫秒数
		System.out.println(System.currentTimeMillis() );  //1585730193534
		
		Date date = new Date(System.currentTimeMillis());
		
		
		date = new Date(System.currentTimeMillis() + 36_000_000);
		
		System.out.println(new SimpleDateFormat("yyyy：MM:dd HH:mm:ss").format(date));
		
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MINUTE, 36_000/60 - 5);
		System.out.println(36_000/60);
		System.out.println(new SimpleDateFormat("yyyy：MM:dd HH:mm:ss").format(calendar.getTime()));
	}

}
