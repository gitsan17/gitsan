package myproj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

@Test
public class ExtentReport1 {

	ExtentReports extent1;
//	ExtentSparkReporter reporter;

	@BeforeTest
	public void config() {
		// ExtentReports, ExtentSparkReporter		
		  String path12 = System.getProperty("user.dir") + "\\Reports\\index.html";
		  ExtentSparkReporter reporter = new ExtentSparkReporter(path12); 
		  extent1 = new ExtentReports();
		  
		  reporter.config().setDocumentTitle("Sankar Generated Report");
		  reporter.config().setReportName("My Results Reports");
		  
		  extent1.attachReporter(reporter); 
		  extent1.setSystemInfo("Tester", "Sankar");		 
	}

	ChromeDriver driver1 = new ChromeDriver();

	@Test
	public void initialSet() {

		extent1.createTest("initial Set");
		driver1.get("https://www.saucedemo.com");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver1.findElement(By.id("user-name")).sendKeys("standard_user");
		driver1.findElement(By.name("password")).sendKeys("secret_sauce");
		// Thread.sleep(1000);
		extent1.flush();
	}
}
