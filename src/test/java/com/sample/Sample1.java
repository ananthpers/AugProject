package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	
	public static void main(String[] args) throws InterruptedException {
		

	WebDriver driver = null;
	 
	 
		driver = new ChromeDriver();
		driver.get("https://www.bobcat.com/in/en");
		driver.manage().window().maximize();    
		//Pop-up
		driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();
		 
		//Equipment
		driver.findElement(By.xpath("//button[@type='button']//parent::li")).click(); 
		 
		//Skid-Steer Loaders
		driver.findElement(By.xpath("//ul[@aria-label='Loaders']/child::li[1]")).click();
		
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
		
		 
		//Compact Track Loaders
				driver.findElement(By.xpath("//button[@type='button']//parent::li")).click();
				driver.findElement(By.xpath("//ul[@aria-label='Loaders']/child::li[2]")).click();
				
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
				 
		//Backhoe Loaders
				driver.findElement(By.xpath("//button[@type='button']//parent::li")).click(); 
				driver.findElement(By.xpath("//ul[@aria-label='Loaders']/child::li[3]")).click();
				
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
	
		 driver.close();
		 
			
		
}
	
}