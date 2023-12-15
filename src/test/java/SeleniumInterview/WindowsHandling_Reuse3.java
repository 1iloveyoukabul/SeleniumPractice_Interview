package SeleniumInterview;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling_Reuse3 {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		
		String parentW = driver.getWindowHandle();

		driver.findElement(By.linkText("Test Selenium")).click();

		switchToNextWindow();

		Thread.sleep(2000);
		driver.findElement(By.id("addBtn")).click();

		Thread.sleep(2000);
		WebElement dropDownLink = driver.findElement(By.linkText("Drop Down"));
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(dropDownLink).keyUp(Keys.CONTROL).build().perform();

		Thread.sleep(2000);
		switchToNextWindow();

		Thread.sleep(2000);
		driver.findElement(By.id("programmingLanguageSelect")).click();
		String newUrl = driver.getCurrentUrl();
		Thread.sleep(2000);
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get(newUrl);

		Thread.sleep(6000);
		driver.quit();

	}

	public static void switchToNextWindow() {
		Set<String> allWindow = driver.getWindowHandles();
		Iterator<String> itr = allWindow.iterator();
		while (itr.hasNext()) {
			driver.switchTo().window(itr.next());
		}
	}

}
