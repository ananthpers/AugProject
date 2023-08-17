package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EquipmentLocators extends BaseClass {
	
	public static WebElement popUpLocator() {
		
		return driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]"));
		
	}
	public static WebElement equipmentLocator() {
		
		return driver.findElement(By.xpath("//button[@type='button']//parent::li")); 
		
	}
	public static WebElement skidsteerloadersLocator() {
		
		return driver.findElement(By.xpath("//ul[@aria-label='Loaders']/child::li[1]")); 
		
	}
	public static WebElement compactTrackLoadersLocators() {
		
		return driver.findElement(By.xpath("//ul[@aria-label='Loaders']/child::li[2]"));
		
	}
	public static WebElement backhoeLoadersLocators() {

		return driver.findElement(By.xpath("//ul[@aria-label='Loaders']/child::li[3]"));
}
}
