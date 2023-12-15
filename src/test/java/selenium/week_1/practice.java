package selenium.week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {
	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='signinLink']")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("guardiansautomation1@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password@123");
        driver.findElement(By.xpath("//button")).click();
        Thread.sleep(2000);
        //element text, contains, starts-with, using two attributes
        //I want to add item to the shopping cart
        driver.findElement(By.xpath("//input[contains(@class,'search')]")).sendKeys("Amazon Fire TV");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='search__btn' and @id='searchBtn']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[text()='Amazon Fire TV ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[starts-with(@id,'addTo')]")).click();

    }}
