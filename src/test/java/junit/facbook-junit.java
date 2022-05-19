An error occurred while collecting items to be installed
session context was:(profile=C__Users_Ajs_eclipse_java-2018-09_eclipse, phase=org.eclipse.equinox.internal.p2.engine.phases.Collect, operand=, action=).
No artifact repository available.
noArtifactRepositoriesAvailablepackage junit;

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


