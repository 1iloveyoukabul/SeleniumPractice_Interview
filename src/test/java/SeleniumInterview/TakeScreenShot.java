package SeleniumInterview;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {
		
		// we have WebDriver interface extends SearchContext
		// TakeeScreenshot, JavascriptExecutor interface are  implements by RemoteWebDriver
		
		WebDriver driver = new FirefoxDriver();

		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		/*
		 * in Selenium WebDriver, we have one interface called TakesScreenshot.
		 * There is a method in TakesSchreenShot interface called getScreenshotAs().
		 * we can use the TakesScreenshot interface to cast to the WebDriver
		 * the getSchreenshotAs(OutputType.File); take the output file type as arguemnt 
		 * which then we can sore this file in a File and then store it in a location sin our computer
		 * useing the FileUtile Class
		 */ 
		 
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		
		
		
		 /* The FIle Utils class libraries are already inculed in selenium 4. So we dont have to 
		 * download the libararies separately and add them to out projecnt build path
		 * or ge the dependency and add it to our pom.xml file
		 * 
		 * so after we take the screenshot, we can specify the path/location where we want to store the schreenshot
		 * we have to also provide a name for our screen file name
		 */
		// with below code i can save screen in selenium
		//FileUtils.copyFile(screenshot , new File(".\\FolderNamescreenShots\\" +"HomePage"+ ".png"));
		
		// with below code stor the screenshots in my computer drive in seleinum folder
		FileUtils.copyFile(screenshot , new File("C:\\Users\\Babrak\\OneDrive\\Desktop\\TekSchool\\Selenium\\ScreenShots\\NameScreenshot2\\.jpg"));
		driver.close();

	}

}
