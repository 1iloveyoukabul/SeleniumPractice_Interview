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

public class Select_Class3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Dropdown will be handled by Select class if the element tag Name stared with select
		//Tage Name <Select>
		
		WebDriver driver = new FirefoxDriver(); 
		
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");
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
		
		WebElement SelectDropDown = driver.findElement(By.xpath("//select[@id='programmingLanguageSelect']"));
		
		Select select = new Select(SelectDropDown);
		select.selectByVisibleText("JavaScript");
		Thread.sleep(3000);
		System.out.println("-------------------------------------------------------------------");
		// created one more method for countrie drop down, above element is in differnt sections
		WebElement countryDrpDown = driver.findElement(By.id("countrySelect"));
		
		Select select1 = new Select(countryDrpDown);
		select1.selectByVisibleText("United Arab Emirates");
		
		System.out.println(select1.isMultiple());// it return false, it is not multiple select
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}

}
