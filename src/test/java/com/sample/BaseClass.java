package com.sample;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public static WebDriver driver = null;
	@BeforeClass
	public static void browserlaunch() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bobcat.com/in/en");
	}
	
	public static void click(WebElement element) {
		element.click();
	}
	@AfterClass
	public static void close() {
		driver.close();
	}
	
	
}
	 