package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc01 {
	WebDriver driver;

	@Test
	public void Facbookpage() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("Mayank");
		driver.findElement(By.id("pass")).sendKeys("Mayank");
		driver.findElement(By.name("login")).click();
		
	}
}
