import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefox {
public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.get("https:/www.facebook.com");
	WebElement findElement = driver.findElement(By.id("email"));
	findElement.sendKeys("palani");
	WebElement findElement2 = driver.findElement(By.id("pass"));
	findElement2.sendKeys("palani");
	
}
}
