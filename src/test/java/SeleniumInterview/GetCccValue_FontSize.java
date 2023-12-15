package SeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCccValue_FontSize {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		/*
		 * 1. Color= color
		 * 2. Font Size = font-size
		 * 3.Backgound Color = backgound-color
		 * 4. Background
		 * 5.Height/ Width size
		 * 6. Box Model (Margin/Padding = padding,border margin
		 * 7. Border =  border radius
		 * 8. content
		*/
		Thread.sleep(3000);
		WebElement tegLogo = driver.findElement(By.xpath("//a[text()='TEKSCHOOL']"));
         System.out.println("TekSchool Logo Font Color: " + tegLogo.getCssValue("Color"));
         
         WebElement shopByCatgory = driver.findElement(By.xpath("//h1[@id='categoryTitle']"));
         
         String str1 = shopByCatgory.getCssValue("height") ;
         System.out.println("Font Height for Shop By Catagory:" + str1);
         
         driver.navigate().to("https://tek-retail-ui.azurewebsites.net/products/1");
         
        WebElement contentAddtoCart = driver.findElement(By.xpath("//button[@id='addToCartBtn']"));
         System.out.println("Content: "+ contentAddtoCart.getCssValue("content"));
         
         Thread.sleep(3000);
         WebElement contentAddtoCart1 = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
         
         System.out.println("Background Color: "+ contentAddtoCart1.getCssValue("background-color"));
		driver.close();
	}

}
//