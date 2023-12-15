package SeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {

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
			 
		
		driver.manage().window().maximize();
		
		//Thread.sleep(20);
		// Threads wait 20 Seconds, it will wait until 20 seconds then it will move to next line of code
		
		//code will be executed immediately once the element is presented and it will not wait for 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// 
		
		// pageLoad will wait until the fully page loaded
		//pageLoadTimeout  depends on the application that tester works on it, government page loading with 90 seconds and 
		//bank page is loading with 15 second.
          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
          // application
          driver.get("https://tek-retail-ui.azurewebsites.net/");
          //driver.manage().deleteAllCookies();// it will delete all cookies history
         
		
		
		String title = driver.getTitle();// return type is String
		System.out.println("Web Page Title: " + title);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//
		WebElement creatNewAccount = driver.findElement(By.xpath("//a[contains(@class,'login__account-btn')]"));
				creatNewAccount.click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//
		WebElement nameField = driver.findElement(By.id("nameInput")); 
		nameField.sendKeys("Smith");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//
		WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
		emailField.sendKeys("johnnn@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//
		WebElement passwordField = driver.findElement(By.xpath("//input[starts-with(@name,'email')]"));
		passwordField.sendKeys("loveyou@");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//
		WebElement confPassowrd = driver.findElement(By.xpath("//input[starts-with(@name,'confirm')]"));
		confPassowrd.sendKeys("loveyou@");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//
		WebElement singbutton = driver.findElement(By.id("signupBtn")); singbutton.click();
		
		
		
		
		
		driver.close();

	}

}
