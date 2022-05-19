package org.test;

import java.io.File;
import java.io.IOException;

import javax.swing.text.Document;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolldown {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https:/www.greenstech.in/selenium-course-content.html");
	//WebElement findElement = driver.findElement(By.name("q"));
//	findElement.sendKeys("iphone"+Keys.ENTER);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	WebElement findElement2 = driver.findElement(By.xpath("(//h3[@class='mb-0'])[13]"));
	executor.executeScript("arguments[0].scrollIntoView(true);", findElement2);
//	TakesScreenshot s= (TakesScreenshot) driver; 
//	 File ss = s.getScreenshotAs(OutputType.FILE);
//	File f = new File("D:greens.jpeg");
//	FileUtils.copyFile(ss, f);
//				
	
}
}