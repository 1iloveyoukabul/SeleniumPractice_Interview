package SeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MovingButtunToRight {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/inputs");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		Thread.sleep(3000);
		WebElement movingButtonToRight = driver.findElement(By.xpath("//input[@id='rangeInput']"));
		
		//click();
		//sendKeys(Keys.RETURN);
		movingButtonToRight.click();
		//movingButtonToRight.sendKeys(Keys.RETURN); // button moves button 25%
		
//		movingButtonToRight.sendKeys(Keys.ARROW_RIGHT);// button moves button 25% and the rest of the method only by 1.
//		movingButtonToRight.sendKeys(Keys.ARROW_RIGHT);//button moves one clik and it will not go all the way to end.
//		movingButtonToRight.sendKeys(Keys.ARROW_RIGHT); 
//		movingButtonToRight.sendKeys(Keys.ARROW_RIGHT);
//		movingButtonToRight.sendKeys(Keys.ARROW_RIGHT);
//		movingButtonToRight.sendKeys(Keys.ARROW_RIGHT);
//		movingButtonToRight.sendKeys(Keys.ARROW_RIGHT);
//		movingButtonToRight.sendKeys(Keys.ARROW_RIGHT);
//		movingButtonToRight.sendKeys(Keys.ARROW_RIGHT);
//		movingButtonToRight.sendKeys(Keys.ARROW_RIGHT);
		/*
		 * How many dfferent method are presernt in selenium to click on web element
		 * click()method
		 * .sendKeys(Keys.Return) method
		 * .Click with action class
		 * .Click with JavaScriptExecuator
		 */
		//movingButtonToRight.sendKeys(Keys.TAB)	;// button moves button 25%
		
		Actions action = new Actions(driver);// button moves button 25%
		action.moveToElement(movingButtonToRight).perform();
		
		
	}

}
