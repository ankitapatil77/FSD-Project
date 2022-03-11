package com.javaProgram.selenium.webElementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_selector {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.switchTo().frame("packageListFrame");
		Thread.sleep(2000);
		//inspect the link
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame("classFrame");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("org.openqa.selenium.devtools")).click();
		
		
		
		
	}

}
