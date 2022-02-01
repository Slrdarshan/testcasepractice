package genericpackage;


import java.util.Date;
import java.util.Random;

public class javaUtilityes {

	
	/**
	 * this method will generate a random number
	 * @return
	 */
	public int getRandamNumber()
	{
		Random ran=new Random();
		int random = ran.nextInt();
		return random;
	}
	
	/**
	 * this method return date 
	 * @return
	 */
	public String getCurrentDate()
	{
		Date date=new Date();
		String currentDate = date.toString();
		return currentDate;
	}
	
	
	/**
	 * this method will return specified date format
	 * @return
	 */
	public String getFinalDateFormat()
	{
		Date date=new Date();
		String d=date.toString();
		String[] dte = d.split(" ");
		String YYYY = dte[5];
		String DD=dte[2];
		String MM=dte[1];
		String today=YYYY+"-"+MM+"-"+DD;
		return today;
				
		
		
		
		
		
		
	}
	
	
}

