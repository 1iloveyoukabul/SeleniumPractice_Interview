package selenium.week_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitTime {

	
		  public static void main(String[] args) throws InterruptedException {
		        WebDriverManager.chromedriver().setup();
		        WebDriver driver = new FirefoxDriver(); 
		        driver.get("https://www.foundit.in/seeker/registration");
		        driver.manage().window().maximize();
		        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
                 Thread.sleep(3000);
		        WebElement fileUpload = driver.findElement(By.xpath("//input[@type='file']"));
		        //fileUpload.sendKeys("file path + file name + extension")
		        fileUpload.sendKeys("C:\\Users\\Babrak\\OneDrive\\Desktop\\TekSchool\\Selenium\\Week 1\\Class-Note---Day-2.docx");
		        //clik on the Okay button on the next screen poping up on the same window
		        Thread.sleep(6000);
                     WebElement okField = driver.findElement(By.xpath("//div[@class='primaryBtn commonBtn']"));
                    		 okField.click();
		       
                    		 driver.close();
                    		 driver.quit();
                    		 driver.manage()	.timeouts()	.pageLoadTimeout(Duration.ofSeconds(0));
                    		 

		    }
	}


