package myproj;

import java.io.File;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CapScreen {		
		@Test
		public static void captureScreenMethod() throws Exception{
	             //   System.setProperty("webdriver.gecko.driver","D://Selenium Environment//Drivers//geckodriver.exe");
			
		//	System.setProperty("webdriver.gecko.driver","C://Users//DELL//Documents//geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
		//	WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		        try{
		            driver.get("https://www.softwaretestingmaterial.com");
			    driver.navigate().refresh();
			    //driver.findElement(By.xpath("//*[@id='cse-search-box']/div/input[4]")).sendKeys("agile"); //Statement with correct Xpath
			    driver.findElement(By.xpath("//*[@id='cse']")).sendKeys("agile"); //Statement with incorrect Xpath	
	                }catch(Exception e){
		            File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			    FileUtils.copyFile(screenshotFile, new File("C://Users//DELL//Documents//SoftwareMaterial.png"));
			}
	        driver.close();
		driver.quit();		
		}
	}