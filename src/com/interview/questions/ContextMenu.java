package com.interview.questions;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32.exe");
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/context_menu");
		
		WebElement checkBox=driver.findElement(By.id("hot-spot"));
		Actions actions= new Actions(driver);
		actions.contextClick(checkBox).build().perform();
		
		Thread.sleep(3000);
		Alert alert= driver.switchTo().alert();
		alert.accept();
	}

}
