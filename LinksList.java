package com.clsa.qa.selenium.browsers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		Dimension d = driver.manage().window().getSize();
		
		driver.manage().window().setSize(new Dimension(d.width/2, d.height/2));
		
		driver.get("https://google.com/");
		
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		
//		for(WebElement link: links) {
//			System.out.println(link.getAttribute("href"));
//		}
		
		driver.close();
		
	}
	
}
