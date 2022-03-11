package com.javaProgram.selenium.webElementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_selector {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		driver.manage().window().maximize();
		
		//if radio button for opera is not selected ,click on it
		//first find radio button
		WebElement e1=driver.findElement(By.xpath("//*[contains(@name,'browser')][3]"));
		
		//use this object is selected or not
		boolean sel=e1.isSelected();
		System.out.println(sel);
		//write if conditio
		if(sel==false) {
			e1.click();
			System.out.println(e1);
		}
	}

}
