package com.interview.questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ActiveElement {

	static WebElement q;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.co.in/");
		//activeElement()
		//driver.switchTo().activeElement().sendKeys("Switzerland \n");
		//Page factory
		PageFactory.initElements(driver, ActiveElement.class);
		q.sendKeys("Switzerland \n");
		
		
	}

}
