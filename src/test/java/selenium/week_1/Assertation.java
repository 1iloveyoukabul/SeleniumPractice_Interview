package selenium.week_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		WebElement TekschoolLogo = driver.findElement(By.linkText("TEKSCHOOL"));
		String actualLogo = getUIText(TekschoolLogo);
		String expectedLogo = "TEKSCHOOL";
		Assert.assertEquals(actualLogo, expectedLogo);
//		
//		WebElement createNewAcct = driver.findElement(By.linkText("Create New Account"));
//		createNewAcct.click();
		WebElement singField = driver.findElement(By.xpath("//a[@id='signinLink']"));
		singField.click();
		Thread.sleep(5000);
		WebElement iwantTosell = driver.findElement(By.xpath("//a[@id='newCompanyAccount']"));

		iwantTosell.click();
		Thread.sleep(5000);
		WebElement createNewAcct = driver.findElement(By.linkText("Create New Account"));
		createNewAcct.click();
		WebElement nameField = driver.findElement(By.id("nameInput"));
		WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
		emailField.sendKeys("inputtekschool03@gmail.com");
		Thread.sleep(5000);
		WebElement passField = driver.findElement(By.id("password"));
		passField.sendKeys("pasword@22");
		Thread.sleep(5000);
		WebElement confipassField = driver.findElement(By.id("passwordInput"));
		confipassField.sendKeys("pasword@22");
		WebElement signField = driver.findElement(By.id("signupBtn"));
		signField.click();
		Thread.sleep(5000);
		WebElement discrptionField = driver.findElement(By.xpath("//textarea[@name='description']"));
		discrptionField.sendKeys("Qualty Control System");
		Thread.sleep(5000);
		WebElement urlField = driver.findElement(By.xpath("//input[@class='signup__input']"));
		urlField.sendKeys("tekschool.us");
		Thread.sleep(5000);
		WebElement creatAcc = driver.findElement(By.id("signupAsSellerBtn"));
		creatAcc.click();



//		System.out.println(driver.getTitle());
//		System.out.println(driver.getTitle());
		
		driver.close();
		driver.quit();
		
		
		
	}

	private static String getUIText(WebElement tekschoolLogo) {
		// TODO Auto-generated method stub
		return null;
	}

	}



