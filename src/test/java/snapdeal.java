import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class snapdeal {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https:/www.snapdeal.com");
	WebElement element = driver.findElement(By.xpath("//span[text()='Sign In']"));
	WebElement findElement = driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[1]/ul/li[1]/a"));
	Actions act = new Actions(driver);
	act.moveToElement(element).moveToElement(findElement).click().perform();
	
	
	
}
}
