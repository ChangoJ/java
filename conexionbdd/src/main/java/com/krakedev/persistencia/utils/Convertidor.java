package com.krakedev.persistencia.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Convertidor {
	private static final String FORMATO_FECHA = "yyyy/MM/dd";
	private static final String FORMATO_HORA= "hh:mm";
	private static final Logger LOGGER = LogManager.getLogger(Convertidor.class);
	
	public static Date convertirFecha(String fecha) throws Exception{
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(FORMATO_FECHA);
		Date fechaDate = null;
		try {
			LOGGER.trace("Convirtiendo fecha "+fecha);
			fechaDate = simpleDateFormat.parse(fecha);
			LOGGER.trace("Fecha convertida "+fechaDate);
			
		} catch (ParseException e) {
			LOGGER.error("La fecha tiene formato incorrecto",e);
			throw new Exception("La fecha tiene formato incorrecto: "+fecha);
		}
		
		return fechaDate;
		
	}
	
	
	public static Date convertirHora(String hora) throws Exception{
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(FORMATO_HORA);
		Date horaDate = null;
		try {
			horaDate = simpleDateFormat.parse(hora);
		} catch (ParseException e) {
			LOGGER.error("La hora tiene formato incorrecto",e);
			throw new Exception("La hora tiene formato incorrecto: "+hora);
		}
		
		return horaDate;
		
	}
}
