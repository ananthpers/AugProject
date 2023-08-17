package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BackHoeLoadersFeatures extends CompactTrackLoadersFeatures{
	
	public static List<WebElement> BackHoeLoadersfeaturesLocators () {

	List<WebElement> header2 = driver.findElements(By.xpath("//a[@data-test-id='product-listing-item-link']"));
	List<WebElement> horsepower2 = driver.findElements(By.xpath("//div[text()='Horsepower']//following-sibling::div"));
	List<WebElement> bucketcapacity2 = driver.findElements(By.xpath("//div[text()='Bucket Capacity']//following-sibling::div"));	
	List<WebElement> operatingweight2 = driver.findElements(By.xpath("//div[text()='Operating Weight']//following-sibling::div"));	
	
	for (int i = 0; i < header2.size()-1; i++) {
		System.out.println(header2.get(i).getText());
		System.out.println("HorsePower : " + horsepower2.get(i).getText());
		System.out.println("Bucketcapacity : " + bucketcapacity2.get(i).getText());
		System.out.println("Operatingweight : " + operatingweight2.get(i).getText());
	}
	return null;

	}
}
