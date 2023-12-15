package SeleniumInterview;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreentShot {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		
		WebElement signFeild = driver.findElement(By.id("signinLink"));
		signFeild.click();
		
		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys("smith12@gmail.com");
		
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("Loveyou@1");
		
		WebElement loginBtnField = driver.findElement(By.id("loginBtn"));
		loginBtnField.click();
		Thread.sleep(3000);
		
		File imgeCapture =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(imgeCapture, new File(".\\screenShots\\"+ "RecapImge"+ ".png"));

	}

}
