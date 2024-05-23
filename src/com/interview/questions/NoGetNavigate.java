package com.interview.questions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoGetNavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		String url="https://letcode.in/radio";
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("window.location=\'"+url+"\'");

	}

}
