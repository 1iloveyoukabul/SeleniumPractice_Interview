package SeleniumInterview;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe_windowsHandling {

	public static void main(String[] args) throws InterruptedException {
		String browserType = "firefox";// browser Type
		WebDriver driver = null;// created interface
		
		if(browserType.equals("edge")){
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			
			
		}else if(browserType.equals("firefox")) {
		
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		
		}else if(browserType.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
			driver.get("https://tek-retail-ui.azurewebsites.net/"); 

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		
		WebElement seleniumText = driver.findElement(By.xpath("//a[text()='Test Selenium']"));
		String parentWindow = driver.getWindowHandle();
		seleniumText.click();
		
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> itr = windowhandles.iterator();
		while(itr.hasNext()) {
			String childwindow = itr.next();
			if(!parentWindow.equals(childwindow)) {
				driver.switchTo().window(childwindow);
				
				
			}
		}
		// this method is for iframe
		WebElement iframe = driver.findElement(By.xpath("//a[text()='Iframe']")); 
		iframe.click();
		
		WebElement iframeMessg = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframeMessg);
		
		String iframtext = driver.findElement(By.xpath("//h1[text()='This page is inside an iframe']")).getText();
		System.out.println(iframtext);
		driver.switchTo().defaultContent();
		String htmlText = driver.findElement(By.xpath("//p[contains(text(),'HTML')]")).getText();
		System.out.println(htmlText);
//		Thread.sleep(3000);
//		WebElement brokImgs = driver.findElement(By.linkText("Broken Images"));// child window element
//		brokImgs.click();
//		
//		driver.switchTo().window(parentWindow);// switching to parent window from child
//		Thread.sleep(3000);
//		WebElement parentWindoElemtn = driver.findElement(By.id("signinLink"));
//		parentWindoElemtn.click();
//		Thread.sleep(3000);
		
		driver.close();
		driver.quit();

	}

}
