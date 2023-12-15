package SeleniumInterview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverNavegation2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		//driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		String titl = driver.getTitle();
		System.out.println("Page Tile: " + titl );
		//System.out.println("Page URL: " +driver.getCurrentUrl()+"Page tile:" + driver.getTitle()); 
		
		Thread.sleep(3000);
		// we can navigate to a different URL
		driver.navigate().to("https://www.facebook.com/");
	    
	    // we can navigate to the previous URL
	    Thread.sleep(3000);
		driver.navigate().back();
		// we can navigate forward to next url
		Thread.sleep(3000);
		driver.navigate().forward();
		// we can refersh the current page
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();

	}

}
