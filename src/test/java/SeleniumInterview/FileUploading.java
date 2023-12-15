package SeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploading {

	public static void main(String[] args) throws InterruptedException {

     //fileupload.sendKeys(file path+file name+extension
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.foundit.in/seeker/registration");
		driver.manage().window().maximize();

		WebElement uploadFileToWebsit = driver.findElement(By.xpath("//input[@type='file']"));
		
		//fileupload.sendKeys(file path + file name + extension
		
		// i copied path of my file from computer and i uploaded into the website
		uploadFileToWebsit.sendKeys("C:\\Users\\Babrak\\OneDrive\\Desktop\\TekSchool\\Selenium\\Test page.docx");
		
		Thread.sleep(3000);
		// click on OKay button

		// I created wait method becase it fail
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		WebElement OkayButn2 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class^='primaryBtn'][class$='commonBtn']")));
		OkayButn2.click();
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
	}

}








