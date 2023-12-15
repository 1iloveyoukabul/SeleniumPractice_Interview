package SeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitInselenium {
public static WebDriver driver;
	public static void main(String[] args) {
	
		
		
		WebDriver driver = new FirefoxDriver();

		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dynamic-select");
		driver.manage().window().maximize();
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
		
		
		

 * when we try to click on balkh province from the dropdown,that will take some time 
 * for this dynamic we element to appear on the page, our test fails, and we get a nooSuchElementFound exception
 * webElement balkh = driver.findElement(By.xpath("xxxxxxxx"));balkh.click();
 * 
 * we can use explicit wait
 * explicit wait is webDriverWait
 * 
 */
		driver.findElement(By.xpath("//p[text()='From']//following-sibling::input")).sendKeys("Balkh");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
          
          WebElement Balkh1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='Balkh']")));
          Balkh1.click();
		
          System.out.println("below is differnt method used");
          
          
          driver.navigate().to("https://shop.demoqa.com/");
          
          WebElement demoDesign = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='noo-row']//child::img[@alt='ToolsQA Demo Site']")));
                  demoDesign.click();
                  
                  System.out.println("below is differnt method used for same porpus");
                  
          WebElement CartButn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='umbra blue ']")));
          CartButn.click();
          
          System.out.println(CartButn.getText());
          
          
          System.out.println("below is differnt method used for same porpus");
          
          WebElement getText = driver.findElement(By.xpath("//div[text()='umbra blue ']"));
          System.out.println(getUITextByWebElement(driver, getText));
          
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
