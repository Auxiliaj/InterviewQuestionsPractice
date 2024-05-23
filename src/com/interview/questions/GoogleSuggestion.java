package com.interview.questions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32.exe");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.co.in/");
		WebElement searchBox= driver.findElement(By.xpath("//textarea[@name='q']"));
		searchBox.sendKeys("The chronicles of Narnia");
		Thread.sleep(5000);
		List<WebElement> searchSuggestion=driver.findElements(By.xpath("//div[@role='option']//following::li"));
		int length=searchSuggestion.size();
		//int position=0;
		for (int i = 0; i < length; i++) {
			WebElement element=searchSuggestion.get(i);
               String suggestion= element.getText();
               System.out.println(suggestion);
		}
//		for (WebElement webElement : searchSuggestion) {
//			String suggestion=webElement.getText();
//			System.out.println(suggestion);
//			
//			if(suggestion.contains("netflix")) {
//				webElement.click();
//				break;
//			}
//			position++;
//			if(position==3) {
//				webElement.click();
//				break;
//			}
//			
		
	}

}
