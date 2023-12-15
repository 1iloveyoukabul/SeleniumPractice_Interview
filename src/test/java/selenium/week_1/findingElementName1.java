package selenium.week_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findingElementName1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("searchInput")).sendKeys("Electronics");
        Thread.sleep(3000);
        List<WebElement> list = driver.findElements(By.xpath("//*[@class='home__category-title']"));
        Thread.sleep(3000);
        
        //System.out.println(list.size());// this method printed 5 elements
        for (int i = 0;i <list.size();i++) {
        	//System.out.println(list.get(i).getText()); it printed elements Names
        	if (list.get(i).getText().contains("Electronics")) {
        		list.get(i).click();
        		break;
        		
        		
        	}}
        
        	driver.close();	
        	driver.quit();
	}



	}


