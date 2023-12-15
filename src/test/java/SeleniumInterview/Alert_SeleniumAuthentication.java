package SeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_SeleniumAuthentication {

	public static void main(String[] args) {
		
		//for authentication alert, we have to incorporate the authentication into the url
				//username = admin
				//password = admin
				//url = http://the-internet.herokuapp.com/basic_auth
				//http://admin:admin@the-internet.herokuapp.com/basic_auth
		
		WebDriver driver = new FirefoxDriver();

		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");// Idded user and pass,admin and admin, it will lunch the url
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.manage().window().maximize();

	}

}
