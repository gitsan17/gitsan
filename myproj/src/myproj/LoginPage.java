package myproj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class LoginPage {
	
	// This test script is only for login with proper uid and pwd

	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

@Parameters ({"URL","username","password"})

    public void paramurl(String urlnam, String unam, String pwd) throws InterruptedException {
    	System.out.println(urlnam);
    	ChromeDriver driver = new ChromeDriver();	
		driver.get(urlnam);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("user-name")).sendKeys(unam);
		driver.findElement(By.name("password")).sendKeys(pwd);
		Thread.sleep(1000);
		driver.findElement(By.className("submit-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[id*='react-burger-menu-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[id*='logout_sidebar_link']")).click();
		Thread.sleep(1000);
		driver.quit();
    }	
}

