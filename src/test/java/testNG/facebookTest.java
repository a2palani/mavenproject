package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookTest {
  @Test
  @Parameters({"email","pass"})
  public void f(String email,String pass) {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https:/www.facebook.com");
		
	WebElement findElement = driver.findElement(By.id("email"));
	findElement.sendKeys(email);
	WebElement findElement2 = driver.findElement(By.id("pass"));
	findElement2.sendKeys(pass);
		
		
  }
}
