package selenium.week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDateWithJSE {

	
		public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			
			
			driver = new FirefoxDriver();
			driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dynamic-select");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//p[text()='From']//following-sibling::input")).sendKeys("Balkh");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//li[text()='Balkh']")).click();
			
			driver.findElement(By.xpath("//p[text()='To']//following-sibling::input")).sendKeys("Herat");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//li[text()='Herat']")).click();
			
			WebElement depart = driver.findElement(By.xpath("//p[text()='Depart']//following-sibling::input"));
			selectDateWithJSE(depart, "2023-06-27");
			
			Thread.sleep(2000);
			WebElement returnDate = driver.findElement(By.xpath("//p[text()='Return']//following-sibling::input"));
			selectDateWithJSE(returnDate, "2023-08-09");
			

			
			Thread.sleep(6000);
			driver.close();
			
		}
		public static void selectDateWithJSE(WebElement element, String yyyymmdd) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value = arguments[1];", element,yyyymmdd);
		}

	

	}


