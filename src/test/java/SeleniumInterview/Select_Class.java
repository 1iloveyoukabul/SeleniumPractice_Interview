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
import org.openqa.selenium.support.ui.Select;

public class Select_Class {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Dropdown will be handled by Select class if the element tag Name stared with select
		//Tage Name <Select>
		
		WebDriver driver = new FirefoxDriver(); 
		
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
       /*
        * TO use Select class in Selenium to handle dropdown, first we have to make sure the node has the selec tagName
        * that represents that webelement in the DOM, has a tag name (Select)
        * then we can store the webelement (dropdown) in and instance of webelement
        * then creat object of Select class in selenium and pass the feference to that webeleemnt in the method parameter
        * the we can use the rference to object of select class to call any of the methods available in select options from dropdown
        * 
        */
		
		// created this method, becase the element tag started with select, then I called the child of the parent
		
		WebElement searchDropDown = driver.findElement(By.id("search"));
		
	    Select select = new Select(searchDropDown);
 		select.selectByIndex(1);//  Select ByIndex Number
		
	     select.selectByVisibleText("Electronics");//selectByVisibleText
		Thread.sleep(3000);
		
		select.selectByVisibleText("Computers");// same method I use for next element in the DOM
		select.selectByIndex(2);
		select.deselectByValue("2");
		
		driver.close();
		driver.quit();

	}

}
