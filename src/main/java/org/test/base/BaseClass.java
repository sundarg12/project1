package org.test.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static WebDriver chromeLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver ();
		return driver;
        }
	public static void urlLaunch(String url) {
		driver.get(url);
	 }
	public static void impWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}
	public static void sendKeys(WebElement e, String data) {
		e.sendKeys(data);
	}
	public static void click(WebElement e) {
		e.click();
	}
	public static String getCurrentUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}
	public static String getTitle() {
		 String title = driver.getTitle();
		return title;
	}

	public static String getAttribute(WebElement e) {
	    String a1 = e.getAttribute("value");
		return a1;
	}
	
	public static String getAttributee(WebElement e) {
		String a2 = e.getAttribute("innerText");
		return a2;
	}
	//-------------Actions--------------
	public static void dragAndDrop(WebElement from, WebElement to) {
		Actions a=new Actions(driver);
		a.dragAndDrop(from, to).perform();
	}
	
	public static void moveToElement(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
	}
	public static void actClick(WebElement e) {
		Actions a=new Actions(driver);
		a.click(e).perform();
	}
	public static void contextClick(WebElement e) {
		Actions a=new Actions(driver);
		a.contextClick(e).perform();
	}
	public static void doubleClick(WebElement e) {
		Actions a=new Actions(driver);
		a.doubleClick(e).perform();
	}
	//-------------Alert---------------
	public static void simpleAlert() {
		Alert a= driver.switchTo().alert();
		a.accept();
	}
	public static void confirmAlert() {
		Alert a= driver.switchTo().alert();
		a.dismiss();
	}
	public static void promptAlert() {
		Alert a= driver.switchTo().alert();
		a.sendKeys("data");
	}
	public static void selectByIndex(WebElement e, int index) {
	    Select s = new Select (e);
	    s.selectByIndex(index);
	}
	public static void selectbyValue(WebElement e, String value) {
		Select s = new Select (e);
		s.selectByValue(value);
	}
	public static void selectByVisibleText(WebElement e, String text) {
		Select s = new Select (e);
		s.selectByVisibleText(text);
	}
	public static void deselectAll(WebElement e) {
		Select s = new Select (e);
		s.deselectAll();
	}
	public static void screenshot() throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File from = ss.getScreenshotAs(OutputType.FILE);
		File to = new File ("C:\\Users\\USER\\eclipse-workspace\\MavenProject1\\Screenshot\\facebook.png");
		FileUtils.copyFile(from, to);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
