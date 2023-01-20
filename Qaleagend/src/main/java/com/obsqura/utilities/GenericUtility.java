package com.obsqura.utilities;
import java.sql.Date;
import java.util.Calendar;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class GenericUtility  {
//Method to create a time stamp.
	//Method to create a unique string.
	public static String timeStamp() {
		Calendar cal=Calendar.getInstance();
		Date time = (Date) cal.getTime();
		String timestamp =time.toString();
		return timestamp;
		
	}
	public void getRandomNumber(WebElement element){
		element.click();
		Random randomGenerator=new Random();
		int randomInt=randomGenerator.nextInt(1000);
		element.sendKeys("username"+ randomInt +"@gmail.com");
		
		
	}
}
