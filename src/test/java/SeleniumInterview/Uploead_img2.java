package SeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Uploead_img2 {
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

		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		WebElement uploadImge = driver.findElement(By.id("file-upload"));
		Thread.sleep(6000);
		uploadImge.sendKeys("C:\\Users\\Babrak\\OneDrive\\Desktop\\TekSchool\\Selenium\\ScreenShots\\Selenium1\\screen.jpg");
		
		WebElement uploadBtun = driver.findElement(By.xpath("//input[@id='file-submit']"));
		
		uploadBtun.click();
		
		
		
          
          
          
	}

}
