package SeleniumInterview;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsHandling2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();

		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		// getWindoHandle()
		// this will return the name of current window as a String
		
		String WindowParent = driver.getWindowHandle();
		System.out.println("Parent Window Name: " +WindowParent );
		
		WebElement element = driver.findElement(By.linkText("Test Selenium"));
		element.click();
		
		// we use the getWindowHandles()method to get list of all windows open by selenium
		//then we store our windows in a Set of String
		Thread.sleep(3000);
		Set<String> allWindows = driver.getWindowHandles();
		
		// we can use the Iterator to iterate through Set<String>list of all of our windows
		Iterator<String> itr = allWindows.iterator();
		// first check and make sure there is a next window open after the parent window
		// Use while loop
		while(itr.hasNext()) {
			//itr.next()will get us the child
			//then we can store the name of child window in a String
			String childW = itr.next();
			// we compare the name of parent and child windo and make suer they are non the same
			if(!WindowParent.equals(childW)) {
			//then we are swithching to the child window
				driver.switchTo().window(childW);
				// once we switch to child window, then we can perform any action on the web element on the child window
				
			}
		}
		Thread.sleep(3000);
		WebElement element2 = driver.findElement(By.id("addBtn"));
		element2.click();
		
		driver.close();
       driver.switchTo().window(WindowParent);
       driver.findElement(By.id("searchInput")).sendKeys("Tekschool");// senk keys to parent Widnow
	}

}
