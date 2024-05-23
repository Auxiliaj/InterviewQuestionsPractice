package com.interview.questions;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://letcode.in/radio");
		Dimension dimension= new Dimension(1366, 766);
		driver.manage().window().setSize(dimension);
		
//		WebElement noElement= driver.findElement(By.id("no"));
//		noElement.click();
//		
//		boolean status=noElement.isSelected();
//		System.out.println(status);
//		
//		boolean enabled=noElement.isEnabled();
//		System.out.println("Radio button is "+enabled);
		
		List<WebElement> radioButton=driver.findElements(By.xpath("//input[@type='radio']"));
		int buttonSize=radioButton.size();
		for (int i = 0; i < buttonSize; i++) {
			WebElement button=radioButton.get(i);
			button.click();		
		}


	}

}
