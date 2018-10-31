package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.TimeZone;
import java.util.*;
public class Data {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 =  new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 =  new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 =  new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		Date y1 = sdf1.parse("30/10/2018");
		Date y2 = sdf2.parse("30/10/2018 18:13:50");
		Date y3 = Date.from(Instant.parse("2018-10-30T18:15:30Z"));
		System.out.println("--- MOSTRANDO OS MESES ---");
		System.out.println("x1 :" + x1);
		System.out.println("sdf2 :" + sdf2.format(x1));
		System.out.println("sdf3 :" + sdf3.format(x1));
		System.out.println("--------------------------");
		
		System.out.println("--- SOMANDO   OS MESES ---");
		System.out.println("y3 :" + sdf2.format(y3));
		Calendar cal = Calendar.getInstance();
		cal.setTime(y3);
		cal.add(Calendar.HOUR_OF_DAY,4);
		y3 = cal.getTime();
		System.out.println("y3 + 4 :" + sdf2.format(y3));
		System.out.println("-----MINUTOS E MES     ---");
		int min = cal.get(Calendar.MINUTE);
		int mes = 1 + cal.get(Calendar.MONTH);
		System.out.printf("Min: " + min +"%n"+"Mes: "+ mes);
		System.out.println("");
		
		
		
		
		
		
		
		
	}

}
