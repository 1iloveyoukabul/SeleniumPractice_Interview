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

public class Select_Class2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Dropdown will be handled by Select class if the element tag Name stared with select
		//Tage Name <Select>
		
		WebDriver driver = new FirefoxDriver(); 
		
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
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
		Thread.sleep(3000);
		WebElement SelectMultiple = driver.findElement(By.xpath("//select[@size='12']"));
		Select select = new Select(SelectMultiple);
		
		System.out.println(select.isMultiple());// it return true becaus it is multiple select
		// Select by Visible Text  ("January");
		select.selectByVisibleText("January");
		
		select.selectByIndex(2);//("February");
		
		Thread.sleep(3000);
		select.selectByValue("Ma");// select by ByValue("Ma")
		
		
		// deselect method
		Thread.sleep(3000);
		select.deselectByValue("Jan");// deselect by ByValue
		Thread.sleep(3000);
		select.deselectByIndex(2);// deselect by index //("February");
		Thread.sleep(3000);
		select.deselectByValue("Ma");// deselect by ByValue
		
		/*
		 * we can select multiple options in a dropdown only if the dropdown has multi Select option
		 * and selenium select class is providing us with the helpe method isMultiple() thourgh which
		 * we can check to see if that dropdown has a multi-select option.
		 */
		
		if(select.isMultiple()) {
		System.out.println("Check if this dropdown has multiple options");
		}else {
			System.out.println("It is not multiple options");
		}
		Thread.sleep(3000);
		driver.close();
		driver.quit(); 

	}

}
