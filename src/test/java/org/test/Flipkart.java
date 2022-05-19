package org.test;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com");
	WebElement findElement = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	findElement.click();
	WebElement findElement2 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
	findElement2.sendKeys("iphone"+Keys.ENTER);
	WebElement findElement3 = driver.findElement(By.xpath("(//div[text()='₹64,999'])[1]"));
	String text = findElement3.getText();
	System.out.println(text);
}
}


