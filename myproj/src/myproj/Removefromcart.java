package myproj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class Removefromcart {

//	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	public void Remcar() throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.saucedem.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.className("submit-button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.cssSelector("button[id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
		driver.findElement(By.xpath("//button[@id ='add-to-cart-sauce-labs-onesie']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//button[@id='remove-sauce-labs-bolt-t-shirt']")).click();
		driver.findElement(By.xpath("(//button[@name='remove-sauce-labs-onesie'])")).click();
	}

}
