package selenium.week_1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {
public static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {



		        WebDriverManager.chromedriver().setup();

		        driver = new ChromeDriver();
		        WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(20));

		        driver.get("https://tek-retail-ui.azurewebsites.net/auth/login");

		        driver.manage().window().maximize();

		       WebElement emailField = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.
		    		   id("email")));
		       emailField.sendKeys("Babrak_m@hotmail.com");
		       Thread.sleep(3000);
		       WebElement PasilField = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.
		    		   id("password")));
		       PasilField.sendKeys("Tekschook123");
		       
		       // rewatched labsession 1:58 minutes 
		    }

		 

		}

		