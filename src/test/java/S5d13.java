import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S5d13 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https:/www.snapdeal.com");
	WebElement findElement = driver.findElement(By.xpath("//span[text()='Mobile & Accessories']"));
	WebElement findElement2 = driver.findElement(By.xpath("//*[@id=\"category7Data\"]/div[1]/div/div/p[4]/a"));
	
	Actions ac = new Actions(driver);
	ac.moveToElement(findElement).moveToElement(findElement2).click().perform();
	
	

	
	
	
	
	
	
	
	
}
}
