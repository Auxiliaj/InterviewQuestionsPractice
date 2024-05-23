package com.interview.questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver= new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32.exe");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		WebElement element = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]//p"));
		String text= element.getText();
		System.out.println(text);
	}

}
