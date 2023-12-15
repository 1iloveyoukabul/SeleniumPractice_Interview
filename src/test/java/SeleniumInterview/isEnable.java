package SeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class isEnable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/checkbox");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		Thread.sleep(3000);
		// isDisplayed(); 
		//isEnabled();
		//isSelected();
		WebElement checkBox = driver.findElement(By.cssSelector("input#javaInput"));
		// it should return true if Displayed and it will return false if not Displayed
		System.out.println(checkBox.isDisplayed());
		// it should return true if Enabled and it will return false if not Enabled
		System.out.println(checkBox.isEnabled());
		// it should return true if Selected and it will return false if not Selected
		System.out.println(checkBox.isSelected());// this method will not check the box
		System.out.println("------------------------------------------------------------");
		
		Thread.sleep(3000);
		WebElement checkCbutton = driver.findElement(By.cssSelector("input#cPlusPlusInput"));
		
		System.out.println(checkCbutton.isDisplayed());// it return true, button is Displayed
		System.out.println(checkCbutton.isEnabled());// it return false, it was not enable
		System.out.println(checkCbutton.isSelected());// it return false, it was not able to 
		// to select becase it was not enable.
	}

}
