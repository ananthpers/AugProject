package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CompactTrackLoadersFeatures extends SkidSteerLoaderFeatures{
	
	public static List<WebElement> compactTractLoaderfeaturesLocators () {
		List<WebElement> header1 = driver.findElements(By.xpath("//a[@data-test-id='product-listing-item-link']"));
		List<WebElement> horsepower1 = driver.findElements(By.xpath("//div[text()='Horsepower']//following-sibling::div"));
		List<WebElement> ratedoperatingcapacity1 = driver.findElements(By.xpath("//div[text()='Rated Operating Capacity (ISO)']//following-sibling::div"));	
		List<WebElement> operatingweight1 = driver.findElements(By.xpath("//div[text()='Operating Weight']//following-sibling::div"));	
		
		for (int i = 0; i < header1.size(); i++) {
			System.out.println(header1.get(i).getText());
			System.out.println("HorsePower : " + horsepower1.get(i).getText());
			System.out.println("Ratedoperatingcapacity : " + ratedoperatingcapacity1.get(i).getText());
			System.out.println("Operatingweight : " + operatingweight1.get(i).getText());
		}

 
	return null; 
}
}