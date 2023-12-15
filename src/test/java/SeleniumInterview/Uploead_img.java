package SeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Uploead_img {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); 
				/*alertIsPresent()
				elementSelectionStateToBe()
				elementToBeClickable()
				elementToBeSelected()
				frameToBeAvaliableAndSwitchToIt()
				invisibilityOfTheElementLocated()
				invisibilityOfElementWithText()
				presenceOfAllElementsLocatedBy()
				presenceOfElementLocated()
				textToBePresentInElement()
				textToBePresentInElementLocated()
				textToBePresentInElementValue()
				titleIs()
				titleContains()
				visibilityOf()
				visibilityOfAllElements()
				visibilityOfAllElementsLocatedBy()
		 */
				
				
		
		WebDriver driver = new FirefoxDriver();

		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/upload");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		WebElement uploadImge = driver.findElement(By.xpath("//input[@id='fileInput']"));
		Thread.sleep(6000);
		uploadImge.sendKeys("C:\\Users\\Babrak\\OneDrive\\Desktop\\TekSchool\\Selenium\\ScreenShots\\Selenium1\\screen.jpg");
		
		
		
		
		
          
          // created below method and i called it for above methods
	}
	public static String getUIText(WebDriver driver,By by) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		String actualText = wait.until(ExpectedConditions.visibilityOfElementLocated(by)).getText();
		return actualText;
          
          
		
	}
	public static String getUITextByWebElement(WebDriver driver,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		String actualText = wait.until(ExpectedConditions.visibilityOf(element)).getText();
		return actualText;
          
          
          
          
          
          
          
          
          
	}

}
