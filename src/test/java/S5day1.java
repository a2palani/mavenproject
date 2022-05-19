import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S5day1 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https:/www.demo.guru99.com/test/drag_drop.html");
	WebElement findElement = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	WebElement findElement2 = driver.findElement(By.xpath("//li[@class='placeholder']"));
	WebElement findElement3 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
WebElement findElement4 = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	Actions act = new Actions(driver);
	act.dragAndDrop(findElement, findElement2).dragAndDrop(findElement3, findElement4).perform();
	
	
}
}