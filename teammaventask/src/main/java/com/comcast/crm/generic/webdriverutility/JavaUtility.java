package com.comcast.crm.generic.webdriverutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public int getRandomNumber() {
		Random random=new Random();
		int ranDomNumber = random.nextInt(5000);
		return ranDomNumber;
	}
	public String getSystemDateyyyyMMdd() {  //if capture current date no need to pass argument
		Date dateOb=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String date=sdf.format(dateOb);
		return date;
	}
	public String getRequiredDateYYYYMMDD(int days) {   //if u pass + int data so it will give you after and if - then previous
 //if u want required date maybe either befor- or after+, then pass the argument
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, days);
		String reqDate = sim.format(cal.getTime());
		return reqDate;
	}
	
}
