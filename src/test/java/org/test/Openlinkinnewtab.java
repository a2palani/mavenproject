package org.test;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Enter;

public class Openlinkinnewtab {
public static void main(String[] args) {
	

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https:/www.amazon.com");
	WebElement findElement = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	findElement.sendKeys("iphone"+Keys.ENTER);
	WebElement findElement2 = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
Actions act = new Actions(driver);
act.keyDown(Keys.CONTROL).moveToElement(findElement2).click().perform();
ArrayList<String>tab=new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(tab.get(1));
}
}