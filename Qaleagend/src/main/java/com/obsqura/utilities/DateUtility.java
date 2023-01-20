package com.obsqura.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;

public class DateUtility {
//Method to return current date value in a particular format.
	public void selectDate(WebDriver driver,String targetDate,String  dateFormat) {
	Calendar calendar= Calendar.getInstance();
	SimpleDateFormat targetDateFormat= new SimpleDateFormat("dd-MMM-yyyy");
	Date formattedTargetDate;
	try
	{
		targetDateFormat.setLenient(false);
		formattedTargetDate=targetDateFormat.parse(targetDate);
		calendar.setTime(formattedTargetDate);
		
		int targetDay=calendar.get(Calendar.DAY_OF_MONTH);
		int targetMonth=calendar.get(Calendar.MONTH);
		int targetYear=calendar.get(Calendar.YEAR);
	}catch (ParseException e) {
	}
}
}
