package SeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleChecBox {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new FirefoxDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/radio");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		Thread.sleep(3000);
	
		WebElement radioButn = driver.findElement(By.cssSelector("input#html"));
		RadioButoDisplayedEnableSelected(radioButn);
		WebElement ccbutton = driver.findElement(By.cssSelector("input#css"));
		
		RadioButoDisplayedEnableSelected(ccbutton);
		
		WebElement javaScript = driver.findElement(By.cssSelector("input#javascript"));
		RadioButoDisplayedEnableSelected(javaScript);
	}
		public static void RadioButoDisplayedEnableSelected(WebElement element) {
			
		if(element.isDisplayed()) {
			if(element.isEnabled()) {
				if(!element.isSelected()) {// if not selected then click on it
					element.click();
				
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
		
		}}
		
	
	


