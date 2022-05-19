import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S5day12 {

	public static void main(String[]srgs) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver() ;
		driver.navigate().to("https:/www.homedepot.com");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[4]/div/ul/li[1]/a"));
		WebElement findElement2 = driver.findElement(By.xpath("//*[@id=\"allDepartmentsFlyout\"]/section[1]/div/ul/li[11]/a"));
		WebElement findElement3 = driver.findElement(By.xpath("//*[@id=\"allDepartmentsFlyout\"]/section[2]/div/ul/li[9]/a"));
		WebElement findElement4 = driver.findElement(By.xpath("//*[@id=\"allDepartmentsFlyout\"]/section[3]/div/ul/li[1]/a"));
Actions act = new Actions(driver);
act.moveToElement(findElement).moveToElement(findElement2).moveToElement(findElement3).moveToElement(findElement4).click().perform();


}
}
