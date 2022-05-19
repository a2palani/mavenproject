package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crossbrowser {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void tc1(String browser) {
		
		if (browser. equals("chrome")) {
			WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		} 
		else if(browser.equals("firefox")){
		WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
		}
		driver.get("https:/www.facebook.com");
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("palani");
		WebElement findElement2 = driver.findElement(By.id("pass"));
		findElement2.sendKeys("palani");
		
	}

}
