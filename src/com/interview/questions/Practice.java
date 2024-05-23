package com.interview.questions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://phptravels.org/login");
//		WebElement cantLogin=driver.findElement(By.cssSelector("#cantLogin"));
//		cantLogin.click();
		
		WebElement emailBox= driver.findElement(By.id("inputEmail"));
		String name=emailBox.getAttribute("placeholder");
		System.out.println(name);
		
				

	}

}
