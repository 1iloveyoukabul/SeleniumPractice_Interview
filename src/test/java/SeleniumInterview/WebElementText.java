package SeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/add-remove-elements");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		Thread.sleep(3000);
		//gettext() for validation
		WebElement textElement = driver.findElement(By.id("addBtn"));// validations of text(Add New Element)
		//System.out.println(textElement.getText());// First Meothod
		
		if(textElement.getText().equals("Add New Element")) { // second method
			System.out.println("Text is Equals");
		}else {
			System.out.println("Text is not Equeals");
			
			
		}
	}

}
