package org.test;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass1 {
protected static WebDriver driver;

Select s;
	public static void browserconfigchrome() {
		WebDriverManager.chromedriver().setup();

		
		
		driver = new ChromeDriver();

	}
	public static void openurl(String url) {
driver.get(url);
	}
	
	
	
	public static void maximizewindow() {
driver.manage().window().maximize();
	}
	public static void refresh() {
driver.navigate().refresh();
	}
	public static WebElement locatebyid(String id) {
		WebElement findElement = driver.findElement(By.id("id"));
		return findElement;
		
	}
	public static WebElement locatebyname(String name) {
		WebElement findElement = driver.findElement(By.name("name"));
		return findElement;
	}
	public static void inputText(WebElement element,String value) {
		element.sendKeys(value);
	}
public static void click(WebElement element) {
element.click();
}	}

