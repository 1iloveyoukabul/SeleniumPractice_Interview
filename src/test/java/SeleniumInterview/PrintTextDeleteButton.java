package SeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintTextDeleteButton {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/challenging-dom");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		WebElement textDeletButn1 = driver.findElement(By.xpath("//table//tbody//tr[3]//td[4]//button[2]"));
		
		
		System.out.println("Get text from Row# 3 for delete button:" + textDeletButn1.getText());
		
		
		driver.close();
		driver.quit();
	}

}
