package myproj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


//This test puposly failed to test screenshots

@Test
public class Addtocart extends BaseClass {
	

	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//ChromeDriver driver = new ChromeDriver();
		public void addcar() throws InterruptedException
		
		{
			
			
	//		Assert.assertTrue(false);
		driver.findElement(By.className("submit")).click();
	//	driver.findElement(By.className("submit-button")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
	//	driver.findElement(By.cssSelector("button[id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
	//	driver.findElement(By.xpath("//button[@id ='add-to-cart-sauce-labs-']")).click();
		
		//		driver.findElement(By.xpath("//button[@id ='add-to-cart-sauce-labs-onesie']")).click();
		}
		
		@BeforeTest
		public void prerequiste() throws InterruptedException {
			initialize();
			driver.get("https://www.saucedemo.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));			
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.name("password")).sendKeys("secret_sa");
			
			//original pwd -- secret_sauce
			Thread.sleep(1000);
			}
		
		@AfterTest
		public void Teardown() throws InterruptedException {
			driver.findElement(By.cssSelector("button[id*='react-burger-menu-btn']")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("a[id*='logout_sidebar_link']")).click();
			Thread.sleep(1000);
			driver.quit();
		}
}


