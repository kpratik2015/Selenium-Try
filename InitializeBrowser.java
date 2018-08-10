package com.clsa.qa.selenium.browsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitializeBrowser {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.google.com/");
		
		String currentUrl = driver.getCurrentUrl();
		
		String title = driver.getTitle();
		
		System.out.println("Security is: " + currentUrl.startsWith("https"));
		
		System.out.println("Title as per expectation: " + title.equals("Google"));
		
//		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("Selenium");
		
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click();
	
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/h3/a")).click();
		
		currentUrl = driver.getCurrentUrl();
		
		title = driver.getTitle();
		
		System.out.println("Expected url matching with actual: " + currentUrl.equals("https://www.seleniumhq.org/"));
		
		System.out.println("Expected title matching: " + title.equals("Selenium - Web Browser Automation"));
		
		driver.close();
	}

}
