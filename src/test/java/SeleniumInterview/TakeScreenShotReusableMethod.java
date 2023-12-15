package SeleniumInterview;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenShotReusableMethod {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException  {
		
		// we have WebDriver interface extends SearchContext
		// TakeeScreenshot, JavascriptExecutor interface are  implements by RemoteWebDriver
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver2 = new EdgeDriver();

		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/challenging-dom");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		takeScreenshot("Home Page2"); 
	}
		
		public static void takeScreenshot(String screenshotName) throws IOException {
		
			String filePath = ".\\myScreenshots\\";
			
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);  

		
		
		FileUtils.copyFile(screenshot, new File(filePath + screenshotName + ".png"));

		driver.close(); 

	}}


