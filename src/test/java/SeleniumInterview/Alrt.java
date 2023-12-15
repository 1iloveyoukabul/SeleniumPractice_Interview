package SeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alrt {

	public static void main(String[] args) throws InterruptedException {
	
		
		String browserType = "firefox";// browser Type
		WebDriver driver = null;// created interface
		
		if(browserType.equals("edge")){
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			
			
		}else if(browserType.equals("firefox")) {
		
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		
		}else if(browserType.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
			driver.get("https://tek-retail-ui.azurewebsites.net/selenium/javascript-alerts"); 

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		WebElement alretbutton = driver.findElement(By.id("alertBtn"));
		
		alretbutton.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		WebElement confirmbutton = driver.findElement(By.id("confirmBtn"));
		confirmbutton.click();
		
		//alert.accept();// confirmed alert
	    alert.dismiss();
	    Thread.sleep(3000);
	    WebElement promptbut = driver.findElement(By.id("promptBtn"));
	    promptbut.click();
	    Alert alert2 = driver.switchTo().alert();
	    
	    Thread.sleep(3000);
	    alert2.sendKeys("School");
	    //alert2.accept();
	    alert2.dismiss();
	    
//	    driver.close();
//	    driver.quit();
		

	}

}
