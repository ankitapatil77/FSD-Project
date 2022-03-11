package com.javaProgram.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingWebPageElement {
	public static void main(String[] args) throws InterruptedException {

		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		driver.manage().window().maximize();
		
		// store the location of the element in an object of type WebElement
		
	WebElement	e1 = driver.findElement(By.id("searchInput"));
	
	     e1.isDisplayed();
	     e1.isEnabled();
	     e1.sendKeys("Automation testing");
	     Thread.sleep(3000);
	     
	     // Name locator    
	 WebElement e2 =  driver.findElement(By.name("search")) ;  
	     
	 e2.clear();
	 e2.sendKeys("New data for automation");
	 e2.clear();
	 
	 // id locator
	// Check if the element is displayed
	 Thread.sleep(3000);
			boolean dis = driver.findElement(By.id("searchInput")).isDisplayed();

			System.out.println("IS the element displayed ?" + dis);
			
			// check if the element is enabled or not
			
			boolean enb = driver.findElement(By.id("searchInput")).isEnabled();
			
			System.out.println("IS the element enabled ?" + enb);
			
			// Enter data in the webelement - input box
			
			if(enb==true)
			{
			driver.findElement(By.id("searchInput")).sendKeys("  Automation testing");
			}
			else
			{
				System.out.println("textbox is not enabled");
			}
			
			//link text as locator
			driver.manage().deleteAllCookies();
			
			driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys(" Testing");
			
			driver.findElement(By.cssSelector("button[type=submit]")).click();
			
			// click on the link
			Thread.sleep(3000);
		WebElement li=	driver.findElement(By.linkText("Current events"));

		li.isDisplayed();
		li.isEnabled();
		li.click();
		
		
		driver.findElement(By.partialLinkText("Log")).click();
		
		Thread.sleep(3000);
		//xpath locator relative path
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Ankita");
		
		// element 2 to click on button
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		// css locator
driver.get("https://signup.heroku.com/");
		
		// 1. find element using tag and id ==> tagname#idvalue
		
		driver.findElement(By.cssSelector("input#first_name")).sendKeys("ankita77");
		
		//driver.findElement(By.cssSelector("input.required")).sendKeys("Mittal");
		
        driver.findElement(By.cssSelector("input[name=last_name]")).sendKeys("Patil");
	}

}
