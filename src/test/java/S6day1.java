import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S6day1 {
public static void main(String[]args) throws AWTException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://greenstech.in/selenium-course-content.html");
	
	WebElement rhtClk = driver.findElement(By.id("heading304"));
	Actions action = new Actions(driver);
	action.contextClick(rhtClk).perform();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_UP);
	r.keyRelease(KeyEvent.VK_UP);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
//	WebElement clckInt = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
//	clckInt.click();
//	
//	WebElement rhtClk = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
//	Actions action = new Actions(driver);
//	action.contextClick(rhtClk).perform();
//	Robot r = new Robot();
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	r.keyPress(KeyEvent.VK_ENTER);
//	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
	
//	WebElement txt = driver.findElement(By.id("email"));
//txt.sendKeys("palani");
//Actions a = new Actions(driver);
//a.moveToElement(txt).perform();;
//a.doubleClick().perform();
//
//Robot robot = new Robot();
//robot.keyPress(KeyEvent.VK_CONTROL);
//robot.keyPress(KeyEvent.VK_X);
//robot.keyRelease(KeyEvent.VK_CONTROL);
//robot.keyRelease(KeyEvent.VK_X);
//
//robot.keyPress(KeyEvent.VK_TAB);
//robot.keyRelease(KeyEvent.VK_TAB);
//robot.keyPress(KeyEvent.VK_CONTROL);
//robot.keyPress(KeyEvent.VK_V);
//robot.keyRelease(KeyEvent.VK_CONTROL);
//robot.keyRelease(KeyEvent.VK_V);






}
}
