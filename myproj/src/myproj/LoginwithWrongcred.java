package myproj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



@Test
public class LoginwithWrongcred {
	
	//This test tries to login with wrong pwd captures and displays the message

//	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	    @Parameters ({"URL","username","password"})
		public void logwicr(String urlnam, String unam, String pwd) throws InterruptedException {
		String txt1;
		ChromeDriver driver = new ChromeDriver();
		driver.get(urlnam);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(unam);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("WrongPwd");
		driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
		Thread.sleep(1000);
		txt1 = driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]")).getText();
		System.out.println(txt1);
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[id*='react-burger-menu-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[id*='logout_sidebar_link']")).click();
		Thread.sleep(1000);
		driver.quit();

	}

}
