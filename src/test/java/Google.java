import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Faccounts.google.com%2FManageAccount%3Fnc%3D1&dsh=S-1073364116%3A1650298889774409&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
WebElement element = driver.findElement(By.id("firstName"));
element.sendKeys("palani");
WebElement findElement = driver.findElement(By.id("lastName"));
findElement.sendKeys("kumar");
WebElement findElement2 = driver.findElement(By.id("username"));
findElement2.sendKeys("a2palani123");
WebElement findElement3 = driver.findElement(By.name("Passwd"));
findElement3.sendKeys("palani4004");
WebElement findElement4 = driver.findElement(By.name("ConfirmPasswd"));
findElement4.sendKeys("palani4004");
WebElement findElement5 = driver.findElement(By.xpath("//span[text()='Next']"));
findElement5.click();
}
}