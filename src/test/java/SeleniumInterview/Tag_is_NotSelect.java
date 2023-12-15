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

public class Tag_is_NotSelect {

	public static void main(String[] args) throws InterruptedException, IOException {
		/*
		 * How to handle dropdown if there is no select tagName?
		 * First created xpath to get number of all child or options to gather
		 * call for loop and if condtions
		 */
		
		WebDriver driver = new FirefoxDriver(); 
		
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		List<WebElement> dropdownNoSeletTagNam = driver.findElements(By.xpath("//select[@id='programmingLanguageSelect']//option"));
		
		for(int i = 0; i < dropdownNoSeletTagNam.size();i++) {
			if(dropdownNoSeletTagNam.get(i).getText().equals("Erlang")) {
				dropdownNoSeletTagNam.get(i).click();
			}
			
		}
		Thread.sleep(3000);
		List<WebElement> countryDropDown = driver.findElements(By.xpath("//select[@id='countrySelect']//option"));
		
		for(int j = 0; j < countryDropDown.size();j++) {
			if(countryDropDown.get(j).getText().equals("United Arab Emirates")) {
		
			
			countryDropDown.get(j).click();
		}
       
	}

}}
