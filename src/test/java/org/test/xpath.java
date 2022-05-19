package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath {
public static void main(String[] args) {
	WebDriverManager .firefoxdriver().setup();
	WebDriver driver  = new FirefoxDriver();
	
	driver.get("https://demo.wpjobboard.net/wp-admin/admin.php?page=wpjb-application");
	WebElement findElement = driver.findElement(By.xpath("//input[@id='wp-submit']"));
findElement.click();
WebElement findElement2 = driver.findElement(By.xpath("//a[text()='Carl Mason']//ancestor::tr"));
String text = findElement2.getText();
System.out.println(text);
}
}
