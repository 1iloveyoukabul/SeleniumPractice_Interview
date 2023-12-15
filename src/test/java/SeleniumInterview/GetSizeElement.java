package SeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetSizeElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		Thread.sleep(3000);

		WebElement sizOfTextSignButn = driver.findElement(By.linkText("Sign in"));
		System.out.println(sizOfTextSignButn.getSize());

		Dimension size = sizOfTextSignButn.getSize();

		System.out.println("Size of Height: " + size.height);

		System.out.println("Size of Width: " + size.width);
		

		System.out.println("Get Location of Element: " + sizOfTextSignButn.getLocation());
		Point elementLocation = sizOfTextSignButn.getLocation();// created a method
		System.out.println("Location of X:" + elementLocation.x);
		System.out.println("Location of Y:" + elementLocation.y);

		Thread.sleep(3000);
		driver.close();

	}

}
