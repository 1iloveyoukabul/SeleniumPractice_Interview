package SeleniumInterview;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NoSuchElement {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		System.out.print(driver.getTitle());
		try {
		WebElement searchButn = driver.findElement(By.className("search__inpuT"));
		// in selenium, we handle the noSuchElementExeceptin with try catch block
		searchButn.sendKeys("vidoe games");
		}catch(NoSuchElementException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		
		driver.close();
		driver.quit();
	}}}


