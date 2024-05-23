package com.interview.questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32.exe");
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/hovers");
		
		WebElement firstImage=driver.findElement(By.xpath("//div[@class='figure']//img[1]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(firstImage).build().perform();
		
		
		WebElement text=driver.findElement(By.xpath("(//a[contains(text(),'View profile')])[1]"));
		boolean status=text.isDisplayed();
		System.out.println(status);
	}

}
