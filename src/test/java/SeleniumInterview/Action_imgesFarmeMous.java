package SeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_imgesFarmeMous {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/inputs");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		Thread.sleep(3000);
		WebElement movingButtonToRight = driver.findElement(By.xpath("//input[@id='rangeInput']"));
        //first create object of Actions class
		Actions action = new Actions(driver);
		//Second we build our actions, useing Action interface
		Thread.sleep(3000);
		Actions actionbuilder = action.dragAndDropBy(movingButtonToRight, 250, 50);
		
		//now if we want perform the action or actions we built using Action interface
		// use the reference actinbuilder and cal the perfor method.
		
		actionbuilder.perform();

	}

}
