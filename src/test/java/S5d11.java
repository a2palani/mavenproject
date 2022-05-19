import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S5d11 {
public static void main(String[]args) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.navigate().to("https:/www.homedepot.com");
WebElement findElement = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[4]/div/ul/li[1]/a"));
Actions act = new Actions(driver);
act.moveToElement(findElement).perform();
WebElement findElement2 = driver.findElement(By.xpath("//*[@id=\"allDepartmentsFlyout\"]/section[1]/div/ul/li[16]/a"));
Actions ac = new Actions(driver);
ac.moveToElement(findElement2).perform();
WebElement findElement3 = driver.findElement(By.xpath("//*[@id=\"allDepartmentsFlyout\"]/section[2]/div/ul/li[1]/a"));
Actions a = new Actions(driver);
a.moveToElement(findElement3).perform();
WebElement findElement4 = driver.findElement(By.xpath("//*[@id=\"allDepartmentsFlyout\"]/section[3]/div/ul/li[7]/a"));
Actions b  = new Actions(driver);
b.moveToElement(findElement4).click().perform();
}
}