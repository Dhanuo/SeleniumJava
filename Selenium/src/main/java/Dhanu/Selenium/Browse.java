

package Dhanu.Selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browse {

	public static void main(String[] args) {
		String URL = "https://rahulshettyacademy.com/";
		
		// TODO Auto-generated method stub
		WebDriver driver;
		
		//System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
		//		driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","D:\\Drivers\\geckodriver.exe");
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.edge.driver","D:\\Drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.navigate().to(URL);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
