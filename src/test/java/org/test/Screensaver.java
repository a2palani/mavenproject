package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screensaver {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https:/facebook.com");
	TakesScreenshot ss = (TakesScreenshot) driver;
	File s= ss.getScreenshotAs(OutputType.FILE);
	File f  = new File("D:d.jpeg");
	FileUtils.copyFile(s, f);
}
}
