package SeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		String title = driver.getTitle();// return type is String
		System.out.println("Web Page Title: " + title);
		
		
//		WebElement signoption1 = driver.findElement(By.id("signinLink"));
//		signoption1.click();
		
//		WebElement signoption2 = driver.findElement(By.className("top-nav__btn"));
//	    signoption2.click();
	    
	    WebElement signoption3 = driver.findElement(By.linkText("Test Selenium"));
	    signoption3.click();
//		WebElement creatNewAccount = driver.findElement(By.xpath("//a[contains(@class,'login__account-btn')]"));
//				creatNewAccount.click();
//				
//				
//		WebElement nameField = driver.findElement(By.id("nameInput")); 
//		nameField.sendKeys("Smith");
//		
//		
//		WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
//		emailField.sendKeys("smith12@gmail.com");
//		
//		WebElement passwordField = driver.findElement(By.xpath("//input[starts-with(@name,'password')]"));
//		passwordField.sendKeys("Loveyou@1");
//		
//		WebElement confPassowrd = driver.findElement(By.xpath("//input[starts-with(@name,'confirm')]"));
//		confPassowrd.sendKeys("Loveyou@1");
//		
//		WebElement singbutton = driver.findElement(By.id("signupBtn")); singbutton.click();
//		
//WebElement AllDrop = driver.findElement(By.id("hamburgerBtn"));AllDrop.click();
//		
//		WebElement electronicitem = driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
//		
//		electronicitem.click();
//		WebElement vidoesection = driver.findElement(By.xpath("//div[contains(@class,'sidebar_content-item')][1]"));
//		vidoesection.click();
//		Thread.sleep(2000);
//		
//		WebElement telvsion = driver.findElement(By.xpath("//p[contains(text(),'TCL 32-inch 3-Series ')]"));
//		telvsion.click();
//		Thread.sleep(2000);
//		
//		WebElement quantities = driver.findElement(By.xpath("//select[contains(@class,'product__select')]"));
//		quantities.sendKeys("2");
//		
//		Thread.sleep(3000);
//		WebElement addToCart = driver.findElement(By.id("addToCartBtn"));
//		addToCart.click();
//		
//		
//		driver.close();
//		driver.quit();
//		
		
		
		//driver.close();

		
	

	}

}
