package SeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		Thread.sleep(3000);
		WebElement signoption1 = driver.findElement(By.id("signinLink"));
		signoption1.click();
		
		WebElement creatNewAccount = driver.findElement(By.xpath("//a[contains(@class,'login__account-btn')]"));
		creatNewAccount.click();
		
		WebElement nameFeild = driver.findElement(By.cssSelector("input#nameInput"));
		nameFeild.sendKeys("Max");nameFeild.clear();
		nameFeild.sendKeys("Ashly");
		
		WebElement emailField = driver.findElement(By.cssSelector("input[id^='email']"));
		emailField.sendKeys("allen1@gmail.com");
		
		WebElement passField = driver.findElement(By.cssSelector("input[id*='passwor']"));
		passField.sendKeys("Schools@1");
		
		WebElement confirmPass = driver.findElement(By.cssSelector("div[class*='input-wrapper']>input#confirmPasswordInput"));
		confirmPass.sendKeys("Schools@1");
		// Difference between click() and submit() methods.
		// if we want to click on Sign up button,we can use click() method.
		//But if we want to submit() the form, without using the locator for Sign up button
		// we can use any locator on this form to submit this form.
		emailField.submit();// 
		Thread.sleep(3000);
		driver.close();
	}

}
