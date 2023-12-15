package SeleniumInterview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverNavegation {
	
	public static void main(String[]args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		// get Title of the page
		System.out.println("The current page tile: "+driver.getTitle());
		// get current page URL
		
		System.out.println("Current Page URL: " + driver.getCurrentUrl());
		//Thread.sleep(2000);
		driver.quit();
		driver.close();
		
	}

}
