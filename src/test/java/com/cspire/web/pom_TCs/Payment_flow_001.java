package com.cspire.web.pom_TCs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Payment_flow_001 {
	@Test
	public static void test1() {
		System.out.println("Mamoni");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mpai\\git\\repository\\CspireWEB\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://test-www.cspire.com");
			driver.manage().window().maximize();
			//driver.findElement(By.linkText("PREPAID >")).click();
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			 //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			//WebElement element =driver.findElement(By.linkText("Shop All Phones"));
			//js.executeScript("arguments[0].scrollIntoView();", element);
			//js.executeScript("window.scrollBy(0,500)");
			//driver.findElement(By.linkText("Shop All Phones")).click();
			//driver.findElement(By.xpath("//img[@alt=LG Wine LTE]")).click();
	}
}
