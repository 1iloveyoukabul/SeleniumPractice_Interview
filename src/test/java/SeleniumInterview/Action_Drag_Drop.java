package SeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Drag_Drop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/drag-drop");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); 

		WebElement paymentShould = driver.findElement(By.xpath("//div[starts-with(text(),'Payment should ')]"));
		WebElement InprogressClo = driver.findElement(By.xpath("//div[contains(@data-rbd-droppable-id,'2')]"));
		
		// created action class
		Actions action = new Actions(driver);
		// created an object of the actions class
		// called pefrom method becaus it is signle acion
		action.dragAndDrop(paymentShould, InprogressClo).perform();// Drag it to in progress table
		Thread.sleep(3000);
		WebElement FullName = driver.findElement(By.xpath("//div[contains(text(),' accept invalid characters')]"));
		action.dragAndDrop(FullName, InprogressClo).perform();

	}

}
