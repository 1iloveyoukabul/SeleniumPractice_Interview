package selenium.week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterWithTekRetail {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        driver.manage().window().maximize();
        WebElement searBoxField = driver.findElement(By.id("searchInput"));
        searBoxField.sendKeys("TV");
        try {
        }catch (NoSuchElementException e) {
        	e.printStackTrace();
        	System.out.println(e.getMessage());
        }

       WebElement seraIcon = driver.findElement(By.id("searchBtn"));
       seraIcon.click();
        
	}

}
