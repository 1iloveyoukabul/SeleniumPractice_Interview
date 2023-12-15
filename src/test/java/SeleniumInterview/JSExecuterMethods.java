package SeleniumInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSExecuterMethods {

	
			public static WebDriver driver;

			public static void main(String[] args) throws InterruptedException {
				/*
				 * JavascriptExecutor is an interface in selenium webDriver that allows us to 
				 * execute Javascript code in selenium.
				 *We use Javascript Executor to peforem some actions that selnium does not provide
				 *for example: highlighting element background
				 *give element border
				 *scroll down the page
				 *scroll to element to view
				 *but also, we can use the JavacriptExecutor methods to perform some actions as alternative
				 *to Selenium methods
				 *for example: click a web element
				 *and we use JavascriptExecutor to perform those actions, if the method fails to perform acions in selenium
				 *
				 */

				WebDriver driver = new FirefoxDriver();

				driver.get("https://tek-retail-ui.azurewebsites.net/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
				
				Thread.sleep(6000);
				
				//WebElement inputField = driver.findElement(By.id("searchInput"));
				
				//sendKeysWithJSE(inputField,"TekSchool");
				
				driver.navigate().to("https://tek-retail-ui.azurewebsites.net/");
				Thread.sleep(6000);
				WebElement getRandoQuote = driver.findElement(By.id("signinLink"));
				clickWithJSE(getRandoQuote);
				
				Thread.sleep(6000);
				
				driver.close();
				
			}
			
			public static void sendKeysWithJSE(WebElement element, String value) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].value='" + value + "'", element); 
			}

			public static void clickWithJSE(WebElement element) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", element); 
			}

			public static void highlightelementRedBorder(WebElement element) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].style.border='2px solid red'", element);
			}

			public static void highlightelementBackground(WebElement element) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].style.background='yellow'", element);
			}

			public static void highlightelementBorderAndBackground(WebElement element) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
			}

			public static void scrolldownPage() {
				JavascriptExecutor js = ((JavascriptExecutor) driver);
				js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			}

			public static void scrollToView(WebElement element) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", element);
				
				
			}}

	

  
