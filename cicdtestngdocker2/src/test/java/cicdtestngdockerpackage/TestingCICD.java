package cicdtestngdockerpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingCICD {
	public static WebDriver driver;
	@BeforeMethod
	public void lauchDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Munir\\eclipse-workspace\\cicdtestngdocker\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
	}
	@Test
	public void Test1() {
		driver.navigate().to("https://www.saucedemo.com/");
		System.out.println("Title is "+driver.getTitle());
	}
	@Test
	public void Test2() {
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		System.out.println("Title is "+driver.getTitle());
	}
	@AfterMethod
	public void quit() {
		driver.quit();
	}

}
