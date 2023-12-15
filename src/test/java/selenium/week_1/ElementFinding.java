package selenium.week_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementFinding {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dynamic-select");

        driver.manage().window().maximize();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


//        WebElement fromEle = driver.findElement(By.xpath("//p[text()='From']//following-sibling::input"));
//
//        fromEle.sendKeys("Balkh");
        WebElement sendKeyField = driver.findElement(By.xpath("//p[text()='From']//following-sibling::input"));
        		sendKeyField.sendKeys("Balkh");
          WebElement provinceField = driver.findElement(By.xpath("//li[text()='Balkh']"));
        provinceField.click();
        //when we try to click on Balkh provice from the dropdown, because it takes some time

        //for this dynamic web element to appear on the page, our test fails, and we get

        //a noSuchElementFound exception


        //we can use explicit wait

        //explicit wait is WebDriverWait

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//
//        WebElement BalkP2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='Balkh']")));

        //BalkP2.click();


		// driver.close();
		// driver.quit();
	}
}
