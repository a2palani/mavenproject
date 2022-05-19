


	package org.test;

	import java.awt.Desktop.Action;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.util.ArrayList;
	import java.util.Date;
	import java.util.List;
	import java.util.Set;
	import java.util.logging.FileHandler;

	import org.apache.commons.io.FileUtils;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriver.TargetLocator;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Baseclass2
	{
		 protected static WebDriver driver;

		public  static void browserconfigchrome() {
			WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
		}
		
		public static void openurl(String url) {
	driver.get(url);
		}
		public static WebElement locateById(String id) {
	WebElement findElement = driver.findElement(By.id(id));
	return findElement;
		}
		public static void InputText(WebElement element,String value) {
		element.sendKeys(value);
		}
		public static void NavigateUr(String url) {
		driver.navigate().to(url);
		
		}
		public static void gettitle() {

	String title = driver.getTitle();	
	}


	public static void getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
	}
	public static void quitbrowser() {
	driver.quit();
	}
	public static WebElement locateByName(String name) {
	WebElement findElement = driver.findElement(By.name(name));
	return findElement;
	}
	public static WebElement locatebyxpath(String xpathExpression) {
	WebElement findElement = driver.findElement(By.xpath(xpathExpression));
	return findElement;
	}
	public static WebElement locatebyclassname(String className) {
	WebElement findElement = driver.findElement(By.className(className));
	return findElement;

	}
	public static WebElement click(WebElement element) {
	element.click();
	return element;
	}
	public static void getText(WebElement elements) {
	String text = elements.getText();
	System.out.println(text);
	}

	public static void getAttribute(WebElement elements,String value) {
	String attribute = elements.getAttribute(value);
	System.out.println(attribute);

	
	
	
	}



	public static WebElement ddnbyindex( WebElement element,int index) {
	Select s = new Select(element);
		s.selectByIndex(index);
		return element;
		
	}

	public static void ddnbyvalue(WebElement element,String value) {
	Select s = new Select(element);
	s.selectByValue(value);
	}


	public static void draganddrop() {
		WebElement from = driver.findElement(By.id("id"));
		WebElement to = driver.findElement(By.id("id"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(from).moveToElement(to).release(to).build().perform();
	}


	public static void maximize() {
	driver.manage().window().maximize();
	}

	public static String excelread(String path,String sheet,int row ,int cell) throws IOException {

		String value = null;
				
	File F = new File(path);
	FileInputStream fin =new  FileInputStream(F);


	Workbook w =new XSSFWorkbook(fin);

	Sheet s = w.getSheet(sheet);
	Row r = s.getRow(row);
	Cell c = r.getCell(cell);
		System.out.println(c);
			
			int celltype = c.getCellType();
			System.out.println(celltype);
			if (celltype==1) {
				 value = c.getStringCellValue();
			System.out.println(value);
		}
			else if (celltype==0) {
				if (DateUtil.isCellDateFormatted(c)) {
					Date dcv = c.getDateCellValue();
					SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
					 value = sim.format(dcv);
					System.out.println(value);
					
				} else {
	double ncv = c.getNumericCellValue();
	long l = (long)ncv;
	 value = String.valueOf(l);
		
				System.out.println(value);}
			}

	return value;


	}
	public static void screenshot(String path) throws IOException {

	TakesScreenshot screenshot = (TakesScreenshot)driver;
	File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
	File f = new File(path);
	FileUtils.copyFile(sourcefile, f);
	}
	public static void refresh() {
		driver.navigate().refresh();
	}
	public static void scrolldown(WebElement lnk) {
		JavascriptExecutor executor =( JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollintoview(false)", lnk);
		
	}
	public void scrollup(WebElement lnk) {
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollintoview(true)", lnk);
		
	}
	public static void closeBrowser() {
		driver.close();

	}
	public static void quitBrowser() {
		driver.quit();

	}

	public static void getattribute(String txt ,WebElement text) {
		String attribute = text.getAttribute("value");
		System.out.println(txt+attribute);
	}
	public static void getText(String Text,WebElement txt) {
		String text = txt.getText();
		System.out.println(Text+text);

	}
	public static void windowhandle(int index) {
		ArrayList<String>tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(index));
	}
	public static void DragandDrop(WebElement source,WebElement target) {
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target);
	}
	public static void Mouseaction(WebElement target) {
		Actions action = new Actions(driver);
		action.moveToElement(target).perform();
	} public static void frame() {
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	int size = frames.size();
	System.out.println(size);
	}
	public static void Alertgettext() {
	Alert alert = driver.switchTo().alert();
	alert.getText();
	}
	public static void Alertsendkeys(String value) {
		 Alert alert = driver.switchTo().alert();
		 alert.sendKeys(value);
	}
	public static void Alertdismiss() {
	Alert alert = driver.switchTo().alert();
	alert.dismiss();
	}
	public static void Alertaccept() {
		Alert alert = driver.switchTo().alert();
	alert.accept();
	}
	public static void Navigateforward() {
		driver.navigate().forward();

	}
	public static void Navigateback() {
		driver.navigate().back();
	}
	}
			
			


