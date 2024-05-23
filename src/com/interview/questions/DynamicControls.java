package com.interview.questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicControls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32.exe");
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		
		WebElement removeButton= driver.findElement(By.xpath("//button[contains(text(),'Remove')]"));
		removeButton.click();
		
		Thread.sleep(4000);
		WebElement text=driver.findElement(By.id("message"));
		String visibleText=text.getText();
		System.out.println(visibleText);
		WebElement textBox=driver.findElement(By.xpath("//input[@type='text']"));		
		boolean status=textBox.isEnabled();
		System.out.println(status);
		
		WebElement enableButton=driver.findElement(By.xpath("//button[contains(text(),'Enable')]"));
		enableButton.click(); 
		Thread.sleep(3000);
		boolean afterstatus=textBox.isEnabled();
		System.out.println(afterstatus);
		
		

	}

}
