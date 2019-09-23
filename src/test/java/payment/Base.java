package payment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public  static WebDriver wedrivercalling() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajasekar\\Desktop\\number programs\\Snapdealpayment\\driver\\chromedriver.exe");
 driver= new ChromeDriver();
 driver.manage().window().maximize();
return driver;
}
	
	public static WebDriver webpage(String u) {
		driver.get(u);
		return driver;
		}
	// 
	//
	public static WebElement lid(String id) {
	WebElement w1=driver.findElement(By.id(id));
	return w1;}
	//
	//
	// 
	//
	public static WebElement lxpath(String id) {
	WebElement w2=driver.findElement(By.xpath(id));
	return w2;}
	
	
	//
	//
	public static List<WebElement> slxpath(String xa) {
		List<WebElement> findElements = driver.findElements(By.xpath(xa));
		return findElements;

	}
	
	public static void btnclick(WebElement b) {
		b.click();}
	//TO ACQUIRE DATA FROM THE EXCEL
	//
	//
	//
	public void send(WebElement e, String value) {
		e.sendKeys(value);

	}
	//
	//
	//
	public static String getdata(int rowNo,int cellnum) throws IOException {
		File loc=new File("C:\\Users\\Rajasekar\\Desktop\\number programs\\payment\\file\\scandi.xlsx");
FileInputStream stream=new FileInputStream(loc);
Workbook w=new XSSFWorkbook(stream);
Sheet s=w.getSheet("sheet1");
Row r=s.getRow(rowNo);
Cell c=r.getCell(cellnum);
int cellType = c.getCellType();
String name=null;
if(cellType==1) {
	name= c.getStringCellValue();
}
if (cellType==0) {
	if (DateUtil.isCellDateFormatted(c)) {
	name=	new SimpleDateFormat("dd-MMM-yy").format( c.getDateCellValue());
	} 
	else {
		name= String.valueOf((long)c.getNumericCellValue());
	}}
return name;}
	//
	//
	//
	//
	// time sleep
	public static void timekeep(int i) throws InterruptedException {
Thread.sleep(i);}
	//
	//
	//
	public static String pwind() {
		String pwindow = driver.getWindowHandle();
		return pwindow;}
	public static Set<String> allwind() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}
	//
	//
	//
	//
	//
	//
//TO TAKE SCREEN SHOT
	
	public static File scrsht(String path) throws IOException {

	//
		//
	
TakesScreenshot tk=(TakesScreenshot)driver;
File s=tk.getScreenshotAs(OutputType.FILE);
File d=new File(path);
FileUtils.copyFile(s, d);
return d;
}
	public static void td(int i) throws InterruptedException {
		Thread.sleep(i);

	}
public static void q() {
	driver.quit();
	}

public static void ro() throws AWTException {
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	}
public static void ro1() throws AWTException {
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	}


}	



