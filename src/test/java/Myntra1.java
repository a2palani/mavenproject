import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra1 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https:/www.myntra.com/register?referer=https:/www.myntra.com");
	driver.manage().window().maximize();
	WebElement phn = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
	phn.sendKeys("9876543219");
	
}	
}
