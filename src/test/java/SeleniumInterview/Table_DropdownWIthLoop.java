package SeleniumInterview;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Table_DropdownWIthLoop {

	public static void main(String[] args) throws InterruptedException, IOException {
		/*
		 * How to handle dropdown if there is no select tagName?
		 * First created xpath to get number of all child or options to gather
		 * call for loop and if condtions
		 */
		
		WebDriver driver = new FirefoxDriver(); 
		
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/challenging-dom");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		List<WebElement> tableCompanyNames = driver.findElements(By.xpath("//table//tbody//tr"));
		
		for(int i = 1;i <= tableCompanyNames.size(); i++) {
			
			 //below xpath is daynamic, it goes 1-6, and  i is cancatnet for iteratins inside the xpath, it comes for forLoop 
			WebElement compayNames = driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[1]//p"));
			
			// contact Name  // below xpath is daynamic
			WebElement compayNames1 = driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[2]//p"));
			System.out.println("Contact Name: " + compayNames1.getText() );
			
			// below xpath is daynamic
			WebElement compayNames2 = driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[3]//p"));
			System.out.println("Country Name: " + compayNames2.getText() );
		}
		
		
		
		
		driver.close();

}}
