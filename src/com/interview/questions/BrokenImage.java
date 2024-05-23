package com.interview.questions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32.exe");
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement brokenImage=driver.findElement(By.xpath("//div[@id='content']//div//img[1]"));
		if(brokenImage.getAttribute("naturalWidth").equals("0")){
			System.out.println("Image is broken");
		}
		
		

	}

}
