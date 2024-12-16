package myproj;

	import java.io.File;
import java.time.Duration;
import java.util.Date;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class BaseClass {
	 public static WebDriver driver;
	   
	   public static void initialize()
	   {    
//		System.setProperty("webdriver.chrome.driver","C:\\SDETADDA\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//    driver.get("   / @sdetadda  ");
	   }
	   
	   public void captureScreenshot(String methodname)
	   { 
	    Date d = new Date();
	    String timestamp = d.toString().replace(":", "_").replace(" ", "");
	    try {
	     File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(file, new File("C:\\Users\\DELL\\eclipse-workspace\\myproj\\Reports\\" + methodname+timestamp + ".jpg"));
	     String path = "C:\\Users\\DELL\\eclipse-workspace\\myproj\\Reports\\" + methodname+timestamp + ".jpg";
	     
	    }
	    
	    catch (Exception e) {
	   e.getMessage();// TODO: handle exception
	  }
	   }
	}
