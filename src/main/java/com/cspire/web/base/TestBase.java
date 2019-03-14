package com.cspire.web.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.cspire.web.util.TestUtil;

public class TestBase {
public static WebDriver driver;
public static Properties prop;
	public TestBase() throws IOException {
		prop=new Properties();
		FileInputStream fileInput=new FileInputStream("C:\\Users\\Mamoni\\git\\Web_Automation1\\src\\main\\java\\com\\cspire\\web\\config\\config.properties");
		prop.load(fileInput);
	}
	
public static void initialization() {
	String BrowserName=prop.getProperty("browserName");
	if(BrowserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.firefox.marionette", ".\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	
		else if(BrowserName.equalsIgnoreCase("chrome")){
	
			System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("ie")){
			
			System.setProperty("webdriver.ie.driver",".\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
}
public static void tearDown() {
    if(null != driver) {
        driver.close();
        driver.quit();
    }
}
}