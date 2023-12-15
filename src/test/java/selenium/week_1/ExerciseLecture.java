package selenium.week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExerciseLecture {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		// driver.get("https://tek-retail-ui.azurewebsites.net/auth/sign-up");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		// WebElement createNewAcct = driver.findElement(By.linkText("Create New
		// Account"));
		// createNewAcct.click();
		WebElement singField = driver.findElement(By.xpath("//a[@id='signinLink']"));
		singField.click();
		Thread.sleep(5000);
		WebElement iwantTosell = driver.findElement(By.xpath("//a[@id='newCompanyAccount']"));

		iwantTosell.click();
		Thread.sleep(5000);
		WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
		emailField.sendKeys("inputtekschool1@gmail.com");
		Thread.sleep(5000);
		WebElement passField = driver.findElement(By.id("password"));
		passField.sendKeys("pasword@22");
		Thread.sleep(5000);
		WebElement compayNamField = driver.findElement(By.xpath("//input[@name='name']"));
		compayNamField.sendKeys("Technologist");
		Thread.sleep(5000);
		WebElement discrptionField = driver.findElement(By.xpath("//textarea[@name='description']"));
		discrptionField.sendKeys("Qualty Control System");
		Thread.sleep(5000);
		WebElement urlField = driver.findElement(By.xpath("//input[@class='signup__input']"));
		urlField.sendKeys("tekschool.us");
		Thread.sleep(5000);
		WebElement creatAcc = driver.findElement(By.id("signupAsSellerBtn"));
		creatAcc.click();

	}

}
