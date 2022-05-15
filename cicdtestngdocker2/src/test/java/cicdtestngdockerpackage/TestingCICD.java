package cicdtestngdockerpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingCICD {
	public static WebDriver driver;
	@BeforeMethod
	public void lauchDriver() {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
//		dc.setPlatform(Platform.WIN10);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Munir\\git\\citngd\\cicdtestngdocker2\\src\\test\\resources\\chromedriver.exe");
		try {
			driver = new RemoteWebDriver(new URL("http://localhost:4444"), dc);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
