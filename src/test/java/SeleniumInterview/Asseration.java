package SeleniumInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Asseration {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		WebElement TekschoolLogo = driver.findElement(By.linkText("TEKSCHOOL"));
	//	String actualLogo = getUIText(TekschoolLogo);
		String expectedLogo = "TEKSCHOOL";
		//Assert.assertEquals(actualLogo, expectedLogo);

	}

}
