package org.test;

import java.rmi.activation.ActivationInstantiator;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandling {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https:/www.greenstechnologys.com");
	WebElement findElement = driver.findElement(By.xpath("//*[@id=\"nav-wrapper\"]/ul/li[3]/a"));
	
	Actions ac = new Actions(driver);
	ac.moveToElement(findElement).perform();
	WebElement findElement2 = driver.findElement(By.xpath("//*[@id=\"nav-wrapper\"]/ul/li[3]/ul/li[2]/a"));
	Actions a = new Actions(driver);
	a.moveToElement(findElement2).click().perform();
	WebElement findElement3 = driver.findElement(By.xpath("//*[@id=\"masterprgm-container\"]/div/div/div[2]/a/button"));
	Actions act = new Actions(driver);
	act.keyDown(Keys.CONTROL).moveToElement(findElement3).click().perform();
	
//	ac.keyDown(Keys.CONTROL).moveToElement(findElement2).click().perform();
//	ArrayList<String>tabs=new ArrayList<String>(driver.getWindowHandles());
//	driver.switchTo().window(tabs.get(1));
//	WebElement findElement3 = driver.findElement(By.xpath("//*[@id=\"add-cart-button-id\"]/span"));
//	findElement3.click();
//	WebElement findElement4 = driver.findElement(By.xpath("//div[@class='you-pay']"));
//	String text = findElement4.getText();
//	System.out.println(text);
//	
//	
}
}
