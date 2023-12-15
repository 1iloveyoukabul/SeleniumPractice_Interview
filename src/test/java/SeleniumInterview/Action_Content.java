package SeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Content {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();

		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/context-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		/*
		 *  right click on the box
		 *  to use action class in Selenium, first we have to create object of action class
		 *  and pass the feference to instance of webdriver to the class parameter()
		 */
		WebElement RightClick = driver.findElement(By.xpath("//div[contains(@class,'4 border-gray-800 border-dashed ')]"));
		/*
		 * now we can use the reference actions to call any methods available in selenium actions class
		 * and since, we are performing a single action, we should call only the peform()method
		 */
		Actions action = new Actions(driver);
		action.contextClick(RightClick).perform();
			

	}

}
