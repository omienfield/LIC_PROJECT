package com.lic.starter.converter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

import com.opencsv.bean.AbstractBeanField;

public class DateConverter extends AbstractBeanField {

    @Override
    protected Object convert(String value) {
    	Date f = null;
    	try {
//  f = new SimpleDateFormat("dd/MM/yyyy").parse(value);
   f=DateUtils.parseDateStrictly(value, "yyyy/MM/dd");
    	}
    	catch(Exception e)
    	{
    		
    	}
return f;
    }

}
