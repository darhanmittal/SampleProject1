package com.tryLocal.tryUtil;

import org.testng.annotations.Test;

import com.tryLocal.tryPageModel.TryPageModel;

import static org.testng.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TryUtil {

	public static RemoteWebDriver driver;
	
	public static Properties prop;
	
	public static TryPageModel pageModel;
	public WebDriver connectToBrowser() {
		
//		try {
		loadPropFile();
		if(prop.getProperty("browser").contains("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver\\geckodriver.exe");
//		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
//        capabilities.setCapability("marionette", true);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//driver.navigate().to("http://google.com");
		}
		
//			assertTrue(false);
//			}catch(Exception e) {
//				
//				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				//FileUtils.
//			}
		return driver;
	}
	
	public void loadPropFile() {
		
		try {
			FileInputStream file = new FileInputStream(("C:\\Users\\Sony\\eclipse-workspace\\tryOn\\Resources\\Prop.properties"));
			prop = new Properties();
			try {
				prop.load(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void initializePages() {
		
		 pageModel = PageFactory.initElements(driver, TryPageModel.class);
	}
	
	public void impicitWait() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void explictWait(WebElement element) {
		
		WebDriverWait expliWait = new WebDriverWait(driver, 20);
		
		expliWait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/*public WebElement fluentWait(WebElement element) {
		
		Wait<WebDriver> flueWait = new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS).
				pollingEvery(5, TimeUnit.SECONDS).ignoring(Exception.class);
		
		return flueWait.until(new Function<WebDriver, WebElement>(){
			
			public WebElement apply(WebDriver driver1) {
				return element;
			}
		});
	}*/
	
	@Test
	public void palidom() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the strng");
		String name = sc.next();
		
//		int ab= Integer.parseInt(name);
//		name = Integer.toString(ab);
		
//		StringBuffer revrs = new StringBuffer(name);
//		
//		revrs.reverse();
		int length = name.length();
		boolean ispalidom = false;
		//if(length%2==0) {
			int j= length-1;
			for(int i=0;i<length/2;i++) {
				if(name.charAt(i)!=name.charAt(j)) {
					ispalidom = false;
				}
				else
					ispalidom = true;
				j--;
			}
			
			System.out.println("ispalidon : " + ispalidom);
		//}
			
			//LinkedList<int> list1 = new LinkedList<int>(1,2,3,8,9);
	}
			
		
}
