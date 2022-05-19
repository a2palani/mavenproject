package junit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facbook {
@Test
public void tc1() {
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com");
String currentUrl = driver.getCurrentUrl();
boolean contains = currentUrl.contains("facebook");
System.out.println(contains);
Assert.assertTrue(contains);
WebElement txt = driver.findElement(By.id("email"));
txt.sendKeys("palani");
String attribute = txt.getAttribute("value");
Assert.assertEquals("kumar", attribute);
WebElement txtpass = driver.findElement(By.id("pass"));
txtpass.sendKeys("1234");
}


}


