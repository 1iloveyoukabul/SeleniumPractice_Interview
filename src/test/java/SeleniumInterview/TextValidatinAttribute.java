package SeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextValidatinAttribute {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/inputs");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		// get attribute
		// soemetime a webElement may not have webelement text, getAttrigut is another
		// that we can get the text for a spceific webelement. and is is also used to
		// get
		// the attribute value of a webelement in a spcecific nod.

		WebElement attributValue = driver.findElement(By.id("textInput"));
		System.out.println(attributValue.getAttribute("placeholder"));
         System.out.println("--------------------------------------------------");
		driver.close();
		driver.quit();

	}

}
