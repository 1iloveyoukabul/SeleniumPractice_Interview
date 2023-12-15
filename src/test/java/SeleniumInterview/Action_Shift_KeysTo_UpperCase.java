package SeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Shift_KeysTo_UpperCase {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();

		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		Thread.sleep(3000);
		WebElement sendUpperkeys = driver.findElement(By.id("searchInput"));
		// I created an object of the actions class
		Actions action = new Actions(driver);
		/*
		 * I want to press shft key and then send keys to the search input field
		 * since  i i'm performeing compsite action, i need to bulid my action first and then perform
		 */
		action.keyDown(Keys.SHIFT).sendKeys(sendUpperkeys, "tekschool").keyUp(Keys.SHIFT).build().perform();
			

	}

}
