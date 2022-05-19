package org.tet;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.test.Baseclass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datprovider  {
	WebDriver driver;
@BeforeMethod
public void beforemethod() {
WebDriverManager.chromedriver().setup();
 driver = new ChromeDriver();
driver.navigate().to("https:/www.facebook.com");
driver.manage().window().maximize();
}
@AfterMethod
public void aftermethod() {
driver.close();
}
@Test(dataProvider = "sample data")
public void tc1(String email,String pass) {
WebElement findElement = driver.findElement(By.id("email"));
findElement.sendKeys(email);
WebElement findElement2 = driver.findElement(By.id("pass"));
findElement2.sendKeys(pass);
}

@DataProvider(name = "sample data")
public Object [][] data() {
return new Object [][] {
	{"username1","password1"},
	{"username2","password"},
};
}
}


