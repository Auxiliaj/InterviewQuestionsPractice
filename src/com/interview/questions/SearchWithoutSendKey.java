package com.interview.questions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchWithoutSendKey {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://www.google.co.in/");
		Dimension dimension= new Dimension(1366, 766);
		driver.manage().window().setSize(dimension);
		
		//WebElement searchBox=driver.findElement(By.name("q"));
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		//executor.executeScript("document.getElementsByName('q')[0].value='Swizerland'", "");	
		//executor.executeScript("arguments[0].value='Swizerland'", searchBox);
		driver.switchTo().activeElement();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_Z);
		robot.keyRelease(KeyEvent.VK_Z);
		
		

	}

}
