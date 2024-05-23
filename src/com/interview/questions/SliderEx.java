package com.interview.questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32.exe");
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/horizontal_slider");
		
		WebElement slider= driver.findElement(By.xpath("//input[@type='range']"));
		Actions actions=new Actions(driver);
		
		actions.dragAndDropBy(slider, 90, 0).build().perform();
	}

}
