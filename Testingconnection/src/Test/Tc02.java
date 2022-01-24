package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tc02 {
	WebDriver driver;

	@Test
	public void Facbookpage() {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("Mayank");
		driver.findElement(By.id("pass")).sendKeys("Mayank");
		driver.findElement(By.name("login")).click();
		
	}
}
