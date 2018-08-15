package tryTestNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
	
	public static WebDriver driver;
	
  @Test
  public void f() {
  }
  
  @Test
	public void connectToBrowser() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver\\geckodriver.exe");
//		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
//      capabilities.setCapability("marionette", true);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("http://google.com");
	}
}
