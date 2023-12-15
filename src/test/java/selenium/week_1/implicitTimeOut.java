package selenium.week_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicitTimeOut {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dynamic-select");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));//wait for certain time to load  page
		driver.manage()	.timeouts().implicitlyWait(Duration.ofSeconds(20));// wait for certain time to visible the element
		WebElement BalkhSendKey = driver.findElement(By.xpath("//p[text()='From']//following-sibling::input"));
		BalkhSendKey.sendKeys("Balkh");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//		WebElement Balkh1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='Balkh']")));
//		Balkh1.click();
		Thread.sleep(3000);
		WebElement Balkh = driver.findElement(By.xpath("//li[text()='Balkh']"));
     	Balkh.click();
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
	}

}
