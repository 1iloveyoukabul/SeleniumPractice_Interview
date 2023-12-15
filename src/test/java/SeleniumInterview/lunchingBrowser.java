package SeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lunchingBrowser {

	public static void main(String[] args) {
		// to setup the browser type, we can use the webdrivermanager
		// to setup/initialize our browser
		WebDriverManager.firefoxdriver().setup();
		
		// we are using the WebDriver interface as reference and create instance
		// of ChromeDriver()class.
		WebDriver driver = new FirefoxDriver();
		
		// get the URL to interact or lunch the browse
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		// to maximize the current windows
		driver.manage().window().maximize();
		

	}

}
