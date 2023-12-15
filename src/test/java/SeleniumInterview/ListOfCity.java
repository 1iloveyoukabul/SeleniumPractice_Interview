package SeleniumInterview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ListOfCity {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dynamic-select");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='From']//following-sibling::input")).sendKeys("a");
		Thread.sleep(2000);
        
		List<WebElement> cityList = driver.findElements(By.xpath("//li"));
		for (int i = 1; i <cityList.size(); i++) {
			
			System.out.println("List of Cities: " + cityList.get(i).getText());
			
		}
	}
}
