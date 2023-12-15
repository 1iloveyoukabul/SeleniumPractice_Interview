package SeleniumInterview;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class FluentWaitT {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();

		driver.navigate().to("https://shop.demoqa.com/");
		driver.manage().window().maximize();
		
		// first we have to creat a n instance of FluentWait
		// We need to use these methods if the implicitlyWait does not work
		FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(20))// check every 2 seconds if the element is available
		         .ignoring(NoSuchElementException.class);// this method will ignore if the duration more gose over 2 seconds
		// first method
		 WebElement UiText = driver.findElement(By.xpath("//div[text()='umbra blue ']"));
         fWait.until(ExpectedConditions.visibilityOf(UiText));
         System.out.println(UiText.getText());
         
		// second method
        
         WebElement UiText2 = fWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='umbra blue ']")));
         
         System.out.println(UiText2.getText());
		driver.close();
		
		
		
		
		
		
		
		

	}

}
