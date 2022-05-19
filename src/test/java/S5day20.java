import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S5day20 {
public static void main(String[]args){
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https:/www.flipkart.com");
	WebElement findElement = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
	findElement.click();
	WebElement findElement2 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[7]/a/div[2]/div/div"));
	Actions a = new Actions(driver);
	a.moveToElement(findElement2).perform();
	
}
}
