package payment;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Timer;

import javax.xml.xpath.XPath;

import org.apache.poi.hssf.record.chart.BeginRecord;
import org.apache.poi.hssf.util.HSSFColor.GOLD;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SCN extends Base{
	@BeforeClass
	public static void begin() {
		System.out.println("The testing scenarios on Scandinavian Airline is done till payment page");

	}
	@Before
	public void timeinsec() {
		Date r=new Date();
		System.out.println(r);
		
	}
@Test

public void flightbookingpage() throws InterruptedException, IOException, AWTException {
	wedrivercalling();
	webpage("https://www.flysas.com/en/");
	td(2000);
	WebElement lp1 = lxpath("(//span[@class='country-name'])[21]");
	btnclick(lp1);
	WebElement lp2 = lxpath("//button[@id='submit-market']");
	btnclick(lp2);
	td(2000);
	WebElement lp3 = lxpath("//button[@id='OW']");
	btnclick(lp3);
	td(5000);
	WebElement lp4 = lxpath("//input[@id='origin']");
	lp4.sendKeys(getdata(0,0));
	WebElement lp5 = lxpath("//input[@id='destination']");
	lp5.sendKeys(getdata(1, 0));
	WebElement lp6 = lxpath("//input[@id='Outbound']");
	btnclick(lp6);
	WebElement lp7 = lxpath("(//td[@class='valid-day'])[10]");
	scrsht("C:\\Users\\Rajasekar\\Desktop\\number programs\\payment\\screeenshot2\\p1.png");
	btnclick(lp7);
	WebElement lp8 = lxpath("//button[@id='search-button']");
	JavascriptExecutor jk1=(JavascriptExecutor) driver;
	jk1.executeScript("arguments[0].click()", lp8);
	td(2000);
	WebElement lp16 = lxpath("//button[@id='policy-accept']");
	btnclick(lp16);
	td(1000);
for (int i = 0; i <16; i++) {
	td(100);
	ro();
}
ro1();	
WebElement lp10 = lxpath("//button[@id='return-button-cart']");
JavascriptExecutor jk2=(JavascriptExecutor) driver;
jk2.executeScript("arguments[0].click()", lp10);
td(5000);
 WebElement lp11 = lxpath("(//input[@tabindex='0'])[9]");
 lp11.sendKeys(getdata(2, 0));
 WebElement lp12 = lxpath("(//input[@tabindex='0'])[10]");
 lp12.sendKeys(getdata(3, 0));
 WebElement lp13 = lxpath("(//input[@tabindex='0'])[11]");
 lp13.sendKeys(getdata(4, 0));
 WebElement lp14 = lxpath("(//input[@tabindex='0'])[12]");
 lp14.sendKeys(getdata(5, 0));
WebElement lp15 = lxpath("//select[@id='gender_ADT0']");
Select s= new Select(lp15);
s.selectByValue("Male");
td(5000);
scrsht("C:\\Users\\Rajasekar\\Desktop\\number programs\\payment\\screeenshot2\\p2.png");
WebElement lp17 = lxpath("//button[@id='return-button-cart']");
btnclick(lp17);
td(5000);
WebElement lpp1 = lxpath("//button[@class='btn secondary small']");
JavascriptExecutor jk5=(JavascriptExecutor) driver;
jk5.executeScript("arguments[0].click()", lpp1);
td(5000);

	WebElement lp18 = lxpath("//li[@id='15A-1-11']");
	JavascriptExecutor jk3=(JavascriptExecutor) driver;
	jk3.executeScript("arguments[0].click()", lp18);
	td(5000);
	scrsht("C:\\Users\\Rajasekar\\Desktop\\number programs\\payment\\screeenshot2\\p3.1.png");
	td(5000);
	WebElement lp19 = lxpath("//button[@id='cart-button']");
	btnclick(lp19);
		
		
		/*
		 * WebElement lp20
		 * =lxpath("//button[@id='seat-notification-error-continue-btn']");
		 * btnclick(lp20);
		 */
		 
	td(5000);
	scrsht("C:\\Users\\Rajasekar\\Desktop\\number programs\\payment\\screeenshot2\\p4.png\\");
WebElement lp21 = lxpath("(//button[@class='btn primary large'])[1]");
btnclick(lp21);
td(10000);
scrsht("C:\\Users\\Rajasekar\\Desktop\\number programs\\payment\\screeenshot2\\p5.png");
td(2000);



System.out.println("In the above program the following queries need to be sorted" +
"---Stale element exception" +
"----How to hold the dynamically changing attributes"
+ "  MOST IMPORTANT---------------------------------"
+ " line number 106-108 has been blocked, this feature will appear only if you done selecting seats for the first time "
+ " with line number 96-98, that means the seat is already booked when I carried out the test on my "
+ " personal computer, when you run the code again fot the second time  seat will in reserved condition"
+ " therefore I attached them as screen shot @p3"); 
td(20000);
}
@After
public void timend() {
	Date d=new Date();
	System.out.println(d);}

	
	  @AfterClass public static void end() throws InterruptedException {
 q(); }
	 

}


