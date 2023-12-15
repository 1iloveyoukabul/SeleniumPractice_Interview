package SeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewWindowTAB {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		System.out.print(driver.getTitle());
		
		WebElement signFeild = driver.findElement(By.id("signinLink"));
		signFeild.click();
		
		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys("smith12@gmail.com");
		
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("Loveyou@1");
		
		WebElement loginBtnField = driver.findElement(By.id("loginBtn"));
		loginBtnField.click();
		Thread.sleep(3000);
		driver.navigate().to("https://www.bankofamerica.com/");
		
		System.out.print(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);// it will open new tap
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		System.out.print(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		//driver.quit();
		

	}

}
