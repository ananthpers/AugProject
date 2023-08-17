package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SkidSteerLoaderFeatures extends EquipmentExe{

	public static List<WebElement>  skidSteerLoaderfeatures_locators() {
		List<WebElement> header = driver.findElements(By.xpath("//a[@data-test-id='product-listing-item-link']"));
		List<WebElement> horsepower = driver.findElements(By.xpath("//div[text()='Horsepower']//following-sibling::div"));
		List<WebElement> ratedoperatingcapacity = driver.findElements(By.xpath("//div[text()='Rated Operating Capacity (ISO)']//following-sibling::div"));	
		List<WebElement> operatingweight = driver.findElements(By.xpath("//div[text()='Operating Weight']//following-sibling::div"));	
		 
		for (int i = 0; i < header.size(); i++) {
			System.out.println(header.get(i).getText());
			System.out.println("HorsePower : " + horsepower.get(i).getText());
			System.out.println("Ratedoperatingcapacity : " + ratedoperatingcapacity.get(i).getText());
			System.out.println("Operatingweight : " + operatingweight.get(i).getText());
		}
		return null;
		
		

	}
 
	
}
