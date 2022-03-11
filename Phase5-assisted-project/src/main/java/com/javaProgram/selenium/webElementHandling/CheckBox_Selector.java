package com.javaProgram.selenium.webElementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Selector {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		driver.manage().window().maximize();
		
		boolean sal=driver.findElement(By.xpath("//*[contains(@name,'color')][4]")).isSelected();
		System.out.println(sal);
		//click checkbox
		driver.findElement(By.xpath("//*[contains(@name,'color')][4]")).click();
		
	    Thread.sleep(2000);
		boolean sal2=driver.findElement(By.xpath("//*[contains(@name,'color')][4]")).isSelected();
		System.out.println(sal2);
	}

}
