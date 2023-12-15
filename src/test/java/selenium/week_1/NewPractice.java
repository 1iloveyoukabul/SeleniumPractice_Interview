package selenium.week_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = null;
		String browser = "chrome";
		if (browser.equals("chromedriver")) {
			driver = new ChromeDriver();
			driver.get("https://tekschool.us/");
			
		}else if (browser.equals("FireFox")) {
			driver.get("https://tekschool.us/");
			
		}else
			driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage()	.timeouts()	.pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://tekschool.us/"); // this command opens url
		String title = driver.getTitle();
		System.out.println(driver.getTitle()+ "Title of the second Page");
		Thread.sleep(3000);
		driver.navigate().refresh();// this method will refresh the page

		driver.navigate().back();// this method will move to previous page

		Thread.sleep(3000);
		driver.navigate().forward();// this method will move to next page. 
      
	}

}
