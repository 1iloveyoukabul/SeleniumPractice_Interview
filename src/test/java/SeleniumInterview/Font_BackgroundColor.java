package SeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Font_BackgroundColor {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		/*
		 * 1. Color= color
		 * 2. Font Size = font-size
		 * 3.Backgound Color = background-color
		 * 4. Background
		 * 5.Height/ Width size
		 * 6. Box Model (Margin/Padding = padding,border margin
		 * 7. Border =  border radius
		 * 8. content
		*/
		Thread.sleep(3000);
		
		WebElement facebookLogo = driver.findElement(By.xpath("//img[contains(@alt,'Facebook')]"));
		
		System.out.println("Background Color: " + facebookLogo.getCssValue("background-color"));
		System.out.println("Font Color: " + facebookLogo.getCssValue("color"));
		System.out.println("Font size: " + facebookLogo.getCssValue("font-size"));
		System.out.println("content: " + facebookLogo.getCssValue("content"));
		driver.close();
	}

}
