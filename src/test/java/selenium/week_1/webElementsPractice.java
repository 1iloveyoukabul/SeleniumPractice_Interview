package selenium.week_1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementsPractice {

	public static void main(String[] args) {
		
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			// thread.sleep : stops execution for certain amount of time
			// implicitlyWait: waits for certain time before it throws exception or
			// it will not wait if the elements becomes available 
			driver.get("https://tek-retail-ui.azurewebsites.net/");	
			
			// difference between findElement and findElements 
			/**
			 * findElement method
			 * - return type of this method is WebElement
			 * - if element is not found it will throw an exception "NoSuchElement" 
			 * 
			 * findElements method
			 * - return return list of Elements 
			 * - if elements are not found it will return an empty List
			 */
			List<WebElement> element = driver.findElements(By.xpath("//TagName[@id='value']"));
			System.out.println(element.size()+" Size of the list");
			//driver.findElement(By.xpath("//tagName[@id='value']")); // this line of the code should throw an exception
//			List<WebElement> elements =driver.findElements(By.xpath("//tagName[@id='value']"));
			//driver.findElement(By.xpath("//tagName[@id='value'"));
//			System.out.println(elements.size() + " size of the List");
//			
			// where to use findElement vs findElements ?
			/**
			 * if you need to find single element, you will use findElement : 90% 
			 * if you need to store a list of elements and then iterate through the
			 * list and select specific value then you can use findElements method. 
			 */
			driver.close();


	}

}
