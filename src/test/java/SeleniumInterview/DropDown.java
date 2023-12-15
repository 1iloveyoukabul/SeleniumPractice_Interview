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

public class DropDown {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new FirefoxDriver(); 
		
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		//WebElement searchDropDown = driver.findElement(By.id("search"));
		
		//Select select = new Select(searchDropDown);
		//select.selectByIndex(3);
		//select.selectByVisibleText("Electronics");//selectByVisibleText
		
		WebElement AllDrop = driver.findElement(By.id("hamburgerBtn"));AllDrop.click();
		
		WebElement electronicitem = driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
		
		electronicitem.click();
		WebElement vidoesection = driver.findElement(By.xpath("//div[contains(@class,'sidebar_content-item')][1]"));
		vidoesection.click();
		Thread.sleep(2000);
		
		WebElement telvsion = driver.findElement(By.xpath("//p[contains(text(),'TCL 32-inch 3-Series ')]"));
		telvsion.click();
		Thread.sleep(2000);
		
		WebElement quantities = driver.findElement(By.xpath("//select[contains(@class,'product__select')]"));
		quantities.sendKeys("2");
		
		Thread.sleep(3000);
		WebElement addToCart = driver.findElement(By.id("addToCartBtn"));
		addToCart.click();
		
        File imgeCapture =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(imgeCapture, new File(".\\screenShots\\"+ "RecapImge"+ ".png"));
		driver.close();
		driver.quit();

	}

}
