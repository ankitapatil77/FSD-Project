package com.javaProgram.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locating_Elements_through_CSS_and_XPath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
		
		driver.get("https://signup.heroku.com/");
		//css selector
		// 1. find element using tag and id ==> tagname#idvalue
		
		driver.findElement(By.cssSelector("input#first_name")).sendKeys("ankita04");
		
		//driver.findElement(By.cssSelector("input.required")).sendKeys("Mittal");
		
        driver.findElement(By.cssSelector("input[name=last_name]")).sendKeys("Patil");
        
        //xpath selector
        Thread.sleep(5000);

        driver.get("https://www.wikipedia.org/");
		
		// Find an element using XPATH locator
		
		// XPATh : Relative XPATH : //tag[@attribute='value']
		 
		
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Ankita");
		
		// element 2 to click on button
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
