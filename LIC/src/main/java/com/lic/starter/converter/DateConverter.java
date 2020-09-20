package com.lic.starter.converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.apache.commons.lang3.time.DateUtils;

import com.opencsv.bean.AbstractBeanField;

public class DateConverter extends AbstractBeanField {

	@Override
	protected Object convert(String value) {
		LocalDate dt = null;
		try {
			DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH);
			dt = LocalDate.parse(value, f);
			System.out.println(dt);

		} catch (Exception e) {

		}
		return dt;
	}

}
