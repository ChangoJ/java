package com.krakedev.conexionbdd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {
	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String fechaFormat = "2020/03/22 10:05:20";
		try {
			Date fecha = simpleDateFormat.parse(fechaFormat);
			System.out.println(fecha);
			long fechaMilis = fecha.getTime();
			System.out.println(fechaMilis);
			java.sql.Date fechaSql = new java.sql.Date(fechaMilis);
			System.out.println(fechaSql);
			Time timeSql = new Time(fechaMilis);
			System.out.println(timeSql);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
