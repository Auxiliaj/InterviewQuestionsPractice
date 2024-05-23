package com.interview.questions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckUnderlined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://www.google.co.in/");
		Dimension dimension= new Dimension(1366, 766);
		driver.manage().window().setSize(dimension);
		
		
		
		WebElement tamil=driver.findElement(By.xpath("//*[contains(text(),'தமிழ்')]"));
		String beforeHovering=tamil.getCssValue("text-decoration");
		System.out.println(beforeHovering);
		Actions actions= new Actions(driver);
		actions.moveToElement(tamil).perform();
		
		String afterHovering=tamil.getCssValue("text-decoration");
		System.out.println(afterHovering);
		
		
		
		

	}

}
