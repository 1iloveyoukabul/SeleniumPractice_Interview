package selenium.week_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploading {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://shop.demoqa.com/");
		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//should fail because the web element is not visible when WebDriver is trying to interact with that element
//		WebElement element = driver.findElement(By.xpath("//div[text()='umbra blue ']"));
//		System.out.println(element.getText());
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement uiText = 
//				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='umbra blue ']")));
		
		WebElement UiText = driver.findElement(By.xpath("//div[text()='umbra blue ']"));
		System.out.println(UiText.getText());
		//get ui text by locator
//		System.out.println(getUIText(driver, By.xpath("//div[text()='umbra blue ']")));

		//get ui text using webelement
//		WebElement element = driver.findElement(By.xpath("//div[text()='umbra blue ']"));
//		System.out.println(getUITextByWebElement(driver, element));
		
		Thread.sleep(1000);
		driver.close();
//	}
//	public static String getUIText(WebDriver driver, By by) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		String actualText = wait.until(ExpectedConditions.visibilityOfElementLocated(by)).getText();
//		return actualText;
//	}
//	public static String getUITextByWebElement(WebDriver driver, WebElement element) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		String actualText = wait.until(ExpectedConditions.visibilityOf(element)).getText();
//		return actualText;
	}}

