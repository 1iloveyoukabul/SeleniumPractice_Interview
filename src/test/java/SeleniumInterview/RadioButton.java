package SeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/radio");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		Thread.sleep(3000);
	
		WebElement radioButn2 = driver.findElement(By.cssSelector("input#html"));
		if(radioButn2.isDisplayed()) {
			if(radioButn2.isEnabled()) {
				if(!radioButn2.isSelected()) {
					radioButn2.click();
				}else {
					System.out.println("Radio button is not Displayed");
				}
				}else {
					System.out.println("Radio button is not Enable");
					
					
					System.out.println("Next method for Radio button");
					
					
				}
		     }else {
			System.out.println("Radio button is not Selected");
			}
		}
	     

	}


