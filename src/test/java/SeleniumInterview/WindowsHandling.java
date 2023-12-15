package SeleniumInterview;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import javax.imageio.spi.ImageTranscoderSpi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();

		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		
		String ParentWidow = driver.getWindowHandle();
		System.out.println("Parent Window Name:" + ParentWidow);
		
		WebElement selenium = driver.findElement(By.linkText("Test Selenium"));
		selenium.click();
		
		Set<String> allwindows = driver.getWindowHandles();
		
		Iterator<String>itr = allwindows.iterator();
		
		while(itr.hasNext()) {;// see if there is anothre window open 
		String childWindow = itr.next();// child window
		if(!ParentWidow.equals(childWindow)) {
			driver.switchTo().window(childWindow);
			
		}
		
	}
		WebElement childW = driver.findElement(By.id("addBtn")); childW.click();
		
		
		WebElement dropdown = driver.findElement(By.linkText("Drop Down")); dropdown.click();
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(dropdown).keyUp(Keys.CONTROL).build().perform();
	Thread.sleep(3000);
		Set<String> allwindows2 = driver.getWindowHandles();
		Iterator<String> itr2 = allwindows2.iterator();
		String childWindow2 = itr2.next();
		
		while(itr2.hasNext()) {
			
		if(!ParentWidow.equals(childWindow2)) {
			driver.switchTo().window(childWindow2);
			
			
		}}
		Thread.sleep(3000);
		//WebElement childs2 = driver.findElement(By.id("programmingLanguageSelect"));childs2.click();
		WebElement childs3 = driver.findElement(By.xpath("//select[contains(@id,'programmi')]//child::option[4]"));childs3.click();
		Thread.sleep(3000);
	
}}
