package myproj;
import java.io.File;
import java.sql.Types;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//public class Takescreenshot {
	//package myproj;
	
	public class BStackTakeScreenshot {
	@Test
	public static String testBStackTakeScreenShot(String testCaseName) throws Exception{
		
	System.setProperty("webdriver.gecko.driver","C://Users//DELL//Documents//geckodriver.exe");		
	FirefoxDriver driver = new FirefoxDriver();

		//	public String takeSnapShot(WebDriver webdriver, String testCaseName) throws Exception{
	//Convert web driver object to TakeScreenshot
	TakesScreenshot scrShot =((TakesScreenshot)driver);
	//Call getScreenshotAs method to create image file
	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	//Move image file to new destination
	File DestFile = new File(System.getProperty ("user.dir") + "//reports//" +testCaseName + ".png");
	//Copy file at destination
	FileUtils.copyFile(SrcFile, DestFile);
	return System.getProperty ("user.dir") + "//reports//" +testCaseName + ".png";
	}
	}
