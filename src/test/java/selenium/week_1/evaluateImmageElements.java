package selenium.week_1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class evaluateImmageElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// thread.sleep : stops execution for certain amount of time
		// implicitlyWait: waits for certain time before it throws exception or
		// it will not wait if the elements becomes available
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		WebElement dropField = driver.findElement(By.id("hamburgerBtn"));
		dropField.click();
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		driver.findElement(By.xpath("(//button[@id='submenuBtn']//following-sibling::div)[1]")).click();
            Thread.sleep(3000);
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size()+ "Number of images"); 
		
	}

}
